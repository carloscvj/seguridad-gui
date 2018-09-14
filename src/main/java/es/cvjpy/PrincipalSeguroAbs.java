/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cvjpy;

import es.cvjpy.aplicacion.PreferenciasCli;
import es.cvjpy.seguridad.LoginDialog;
import es.cvjpy.seguridad.MenuNodoMngrCli;
import es.cvjpy.seguridad.Rol;
import es.cvjpy.seguridad.SeguridadMenuUI;
import es.cvjpy.seguridad.Usuario;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author carlos
 */
public abstract class PrincipalSeguroAbs extends PrincipalUIAbs implements PrincipalSeguroPro {

    private Usuario usuario;

    @Override
    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean sePermite(Class clase) throws Exception {
        boolean ret = true;
        MenuNodoMngrCli menuNodoMngrCli = new MenuNodoMngrCli();
        menuNodoMngrCli.setPrincipalPro(getServidor());
        List<Rol> permitidos = menuNodoMngrCli.getPermitidos(clase.getName());
        if (permitidos != null) {
            if (!permitidos.isEmpty()) {
                ret = false;
                if (getUsuario() == null) {
                    MenuElemento mitem = SeguridadMenuUI.crearLoginME();
                    LoginDialog llama = (LoginDialog) getGui(mitem);
                    llama.inicio(this);
                }
                if (getUsuario() != null) {
                    ret = getUsuario().sepermiten(permitidos);
                }
            }
        }
        return ret;
    }

    @Override
    protected String getUsuarioEnTitulo() {
        String ret = getUsuarioRemoto() + " - no ha sido autenticado";
        Usuario user = getUsuario();
        if (user != null) {
            ret = user.getId() + " - " + user.getDescripcion();
        }
        return ret;
    }

    @Override
    public void usuarioCambiado() throws Exception {
        limpiarRecursos();
        PreferenciasCli preferenciasCli = new PreferenciasCli();
        preferenciasCli.setPrincipalPro(getServidor());
        estableceLookAndFeel(preferenciasCli.getPreferencias().getAspectoSwing().getLineaSelected());
        String idioma = preferenciasCli.getPreferencias().getIdioma();
        Locale.setDefault(new Locale(idioma, Locale.getDefault().getCountry()));
        getPrincipalFrame().setBarraMenu(getBarraMenu());
        getPrincipalFrame().inicio(this);
        getPrincipalFrame().setVisible(true);
    }

}
