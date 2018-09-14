/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cvjpy;

import es.cvjpy.seguridad.Usuario;
import java.awt.Image;
import javax.swing.JMenuBar;

/**
 *
 * @author CarlosVJ
 */
public interface PrincipalSeguroPro extends PrincipalUIPro {

    Usuario getUsuario();

    void setUsuario(Usuario usuario);

    void usuarioCambiado() throws Exception;
}
