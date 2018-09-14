/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * SignatariosClavesFrame.java
 *
 * Created on 18-jun-2010, 13:50:28
 */
package es.cvjpy.seguridad;

import es.cvjpy.GuiPro;
import es.cvjpy.MenuElemento;
import es.cvjpy.PrincipalPro;
import es.cvjpy.PrincipalSeguroPro;
import es.cvjpy.PrincipalUIPro;
import es.cvjpy.util.ModeloGuiPro;

/**
 *
 * @author CarlosVJ
 */
public class UsuariosClavesFrame extends javax.swing.JFrame implements GuiPro {

    private String antacceso;

    /**
     * Creates new form SignatariosClavesFrame
     */
    public UsuariosClavesFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        claveacceso = new javax.swing.JPasswordField();
        confirmarclaveacceso = new javax.swing.JPasswordField();
        mngrBarra1 = new es.cvjpy.componentes.MngrBarra();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("seguridadlit"); // NOI18N
        jLabel3.setText(bundle.getString("Nueva_clave")); // NOI18N

        jTextField2.setEditable(false);
        jTextField2.setFocusable(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${datos.mngrCli.actual.descripcion}"), jTextField2, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText(bundle.getString("Confirmar_nueva_clave")); // NOI18N

        jTextField1.setEditable(false);
        jTextField1.setFocusable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${datos.mngrCli.actual.id}"), jTextField1, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText(bundle.getString("Identificador")); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText(bundle.getString("Descripcion")); // NOI18N

        claveacceso.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                claveaccesoCaretUpdate(evt);
            }
        });
        claveacceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveaccesoActionPerformed(evt);
            }
        });
        claveacceso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                claveaccesoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                claveaccesoFocusLost(evt);
            }
        });

        confirmarclaveacceso.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                confirmarclaveaccesoCaretUpdate(evt);
            }
        });
        confirmarclaveacceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarclaveaccesoActionPerformed(evt);
            }
        });
        confirmarclaveacceso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmarclaveaccesoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmarclaveaccesoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
                    .addComponent(claveacceso, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
                    .addComponent(confirmarclaveacceso, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(claveacceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(confirmarclaveacceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        mngrBarra1.setF1(false);
        mngrBarra1.setF2(false);
        mngrBarra1.setF4(false);
        mngrBarra1.setF5(false);
        mngrBarra1.setF6(false);
        mngrBarra1.setF7(false);
        mngrBarra1.setF8(false);
        mngrBarra1.setImaginable(false);
        mngrBarra1.setNavegable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${confirmado}"), mngrBarra1, org.jdesktop.beansbinding.BeanProperty.create("enabledF3"));
        bindingGroup.addBinding(binding);

        mngrBarra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngrBarra1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mngrBarra1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mngrBarra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void claveaccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveaccesoActionPerformed
      this.claveacceso.transferFocus();
  }//GEN-LAST:event_claveaccesoActionPerformed

  private void confirmarclaveaccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarclaveaccesoActionPerformed
      this.confirmarclaveacceso.transferFocus();
  }//GEN-LAST:event_confirmarclaveaccesoActionPerformed

  private void claveaccesoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_claveaccesoFocusGained
      this.antacceso = new String(this.claveacceso.getPassword());
      this.claveacceso.setSelectionStart(0);
      this.claveacceso.setSelectionEnd(999);
      refresh();
  }//GEN-LAST:event_claveaccesoFocusGained

  private void claveaccesoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_claveaccesoFocusLost
      this.claveacceso.setSelectionEnd(0);
      String tiene = new String(this.claveacceso.getPassword());
      if (!tiene.trim().equals(this.antacceso.trim())) {
          this.confirmarclaveacceso.setText("");
      }
      refresh();
  }//GEN-LAST:event_claveaccesoFocusLost

    private void mngrBarra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngrBarra1ActionPerformed

        String cual = evt.getActionCommand().trim();
        if (cual.equals("ESC")) {
            fin();
            return;
        }
        refresh();
    }//GEN-LAST:event_mngrBarra1ActionPerformed

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        refresh();
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        refresh();
    }//GEN-LAST:event_jTextField2FocusLost

    private void confirmarclaveaccesoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmarclaveaccesoFocusGained
        this.confirmarclaveacceso.setSelectionStart(0);
        this.confirmarclaveacceso.setSelectionEnd(999);
        refresh();
    }//GEN-LAST:event_confirmarclaveaccesoFocusGained

    private void confirmarclaveaccesoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmarclaveaccesoFocusLost
        this.confirmarclaveacceso.setSelectionEnd(0);
        refresh();
    }//GEN-LAST:event_confirmarclaveaccesoFocusLost

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        jTextField2.transferFocus();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void claveaccesoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_claveaccesoCaretUpdate
        refresh();
    }//GEN-LAST:event_claveaccesoCaretUpdate

    private void confirmarclaveaccesoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_confirmarclaveaccesoCaretUpdate
        refresh();
    }//GEN-LAST:event_confirmarclaveaccesoCaretUpdate
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField claveacceso;
    private javax.swing.JPasswordField confirmarclaveacceso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private es.cvjpy.componentes.MngrBarra mngrBarra1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    private UsuarioMngrCli datos;
    public static final String PROP_DATOS = "datos";

    public UsuarioMngrCli getDatos() {
        return datos;
    }

    public void setDatos(UsuarioMngrCli datos) {
        UsuarioMngrCli oldDatos = this.datos;
        this.datos = datos;
        firePropertyChange(PROP_DATOS, oldDatos, datos);
    }
    private final ModeloGuiPro auxiliar = new ModeloGuiPro(this);

    private Usuario getUserLogin() {
        Usuario ret;
        PrincipalSeguroPro principal = (PrincipalSeguroPro) auxiliar.getPadre();
        ret = principal.getUsuario();
        return ret;
    }

    @Override
    public void inicio(PrincipalUIPro padre) {
        auxiliar.inicio(padre);
        UsuarioMngrCli prog = new UsuarioMngrCli();
        prog.setPrincipalPro(padre.getServidor());
        prog.ultimo();
        mngrBarra1.setDatos(prog);
        setDatos(prog);
        reentrada();
    }

    private void reentrada() {
        Usuario userLogin = getUserLogin();
        if (userLogin == null) {
            GuiPro gui = auxiliar.getPadre().getGui(SeguridadMenuUI.crearLoginME());
            auxiliar.getPadre().llamarA(gui);
        }
        userLogin = getUserLogin();
        if (userLogin == null) {
            this.fin();
        } else {
            setVisible(true);
            getDatos().setLineaSelected(userLogin);
            getDatos().selecciona();
            claveacceso.setText(this.getDatos().getActual().getClave());
            confirmarclaveacceso.setText(this.getDatos().getActual().getClave());
            refresh();
        }
    }

    @Override
    public boolean puedosalir() {
        return auxiliar.puedosalir();
    }

    @Override
    public void fin() {
        auxiliar.fin();
    }
    public static final String PROP_CONFIRMADO = "confirmado";

    public void refresh() {
        firePropertyChange(PROP_CONFIRMADO, null, true);
        firePropertyChange(PROP_DATOS, null, datos);
    }

    public boolean isConfirmado() {
        boolean ret = false;
        if (getDatos() != null) {
            if (getDatos() != null) {
                if (getDatos().getActual() != null) {
                    String cl = new String(this.claveacceso.getPassword());
                    String confir = new String(this.confirmarclaveacceso.getPassword());
                    if (cl.equals(confir)) {
                        getDatos().getActual().setClave(cl);
                        ret = true;
                    }
                }
            }
        }
        return ret;
    }

    @Override
    public boolean isIniciado() {
        return auxiliar.isIniciado();
    }

    @Override
    public void rellama() {
        setState(0);
        reentrada();
    }
}
