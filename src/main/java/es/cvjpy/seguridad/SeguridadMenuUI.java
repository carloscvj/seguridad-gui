/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cvjpy.seguridad;

import es.cvjpy.MenuElemento;
import java.util.ResourceBundle;
import javax.swing.JMenu;

/**
 *
 * @author carlos
 */
public class SeguridadMenuUI {

    public static MenuElemento crearLoginME() {
        MenuElemento ret = new MenuElemento();
        ret.setGui(LoginDialog.class);
        ret.setText(ResourceBundle.getBundle("seguridadlit").getString("menu." + ret.getGui().getName()));
        return ret;
    }

    public static MenuElemento crearUsuariosClavesME() {
        MenuElemento ret = new MenuElemento();
        ret.setGui(UsuariosClavesFrame.class);
        ret.setText(ResourceBundle.getBundle("seguridadlit").getString("menu." + ret.getGui().getName()));
        return ret;
    }

    public static MenuElemento crearUsuarioMngrME() {
        MenuElemento ret = new MenuElemento();
        ret.setGui(UsuarioMngrFrame.class);
        ret.setText(ResourceBundle.getBundle("seguridadlit").getString("menu." + ret.getGui().getName()));
        return ret;
    }

    public static MenuElemento crearMenuNodoMngrME() {
        MenuElemento ret = new MenuElemento();
        ret.setGui(MenuNodoMngrFrame.class);
        ret.setText(ResourceBundle.getBundle("seguridadlit").getString("menu." + ret.getGui().getName()));
        return ret;
    }

    public static MenuElemento crearRolMngrME() {
        MenuElemento ret = new MenuElemento();
        ret.setGui(RolMngrFrame.class);
        ret.setText(ResourceBundle.getBundle("seguridadlit").getString("menu." + ret.getGui().getName()));
        return ret;
    }

    public static JMenu crearSeguridadJM() {
        JMenu papa = new JMenu();
        papa.setName("seguridad");
        papa.setText(ResourceBundle.getBundle("seguridadlit").getString("menu." + papa.getName()));
        papa.add(crearLoginME());
        papa.add(crearRolMngrME());
        papa.add(crearMenuNodoMngrME());
        papa.add(crearUsuarioMngrME());
        papa.add(crearUsuariosClavesME());
        return papa;
    }

    private SeguridadMenuUI() {
    }
}
