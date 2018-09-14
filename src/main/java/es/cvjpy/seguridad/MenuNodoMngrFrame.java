/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MenuMntoFrame.java
 *
 * Created on 14-abr-2010, 13:33:27
 */
package es.cvjpy.seguridad;

import es.cvjpy.GuiPro;
import es.cvjpy.MenuElemento;
import es.cvjpy.PrincipalUIPro;
import es.cvjpy.util.ModeloGuiPro;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.MenuElement;

/**
 *
 * @author CarlosVJ
 */
public class MenuNodoMngrFrame extends javax.swing.JFrame implements GuiPro {

    /**
     * Creates new form MenuMntoFrame
     */
    public MenuNodoMngrFrame() {
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

        mngrBarra1 = new es.cvjpy.componentes.MngrBarra();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoDescripcion = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel6 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        rolesopcion = new javax.swing.JList();
        barraMenusCMP = new javax.swing.JMenuBar();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        mngrBarra1.setF1(false);
        mngrBarra1.setF2(false);
        mngrBarra1.setF4(false);
        mngrBarra1.setF5(false);
        mngrBarra1.setF6(false);
        mngrBarra1.setF7(false);
        mngrBarra1.setF8(false);
        mngrBarra1.setImaginable(false);
        mngrBarra1.setNavegable(false);
        mngrBarra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngrBarra1ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("seguridadlit"); // NOI18N
        jLabel1.setText(bundle.getString("Identificador")); // NOI18N

        campoId.setEditable(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${datos.mngrCli.actual.id}"), campoId, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText(bundle.getString("Descripcion")); // NOI18N

        campoDescripcion.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoId, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
                    .addComponent(campoDescripcion))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setPreferredSize(new java.awt.Dimension(360, 360));

        jLabel9.setText(bundle.getString("Roles_definidos")); // NOI18N
        jLabel9.setFocusable(false);

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setFocusable(false);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${datos.intercambio.origen}");
        org.jdesktop.swingbinding.JListBinding jListBinding = org.jdesktop.swingbinding.SwingBindings.createJListBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jList1);
        bindingGroup.addBinding(jListBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${datos.intercambio.origenSelected}"), jList1, org.jdesktop.beansbinding.BeanProperty.create("selectedElements"));
        bindingGroup.addBinding(binding);

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jPanel6.setPreferredSize(new java.awt.Dimension(50, 360));

        jButton3.setText(">>");
        jButton3.setFocusable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${datos.intercambio.originable}"), jButton3, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("<<");
        jButton4.setFocusable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${datos.intercambio.destinable}"), jButton4, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel7.setPreferredSize(new java.awt.Dimension(370, 360));

        jLabel8.setText(bundle.getString("Roles_requeridos")); // NOI18N
        jLabel8.setFocusable(false);

        rolesopcion.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        rolesopcion.setFocusable(false);

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${datos.intercambio.destino}");
        jListBinding = org.jdesktop.swingbinding.SwingBindings.createJListBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, rolesopcion);
        bindingGroup.addBinding(jListBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${datos.intercambio.destinoSelected}"), rolesopcion, org.jdesktop.beansbinding.BeanProperty.create("selectedElements"));
        bindingGroup.addBinding(binding);

        rolesopcion.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                rolesopcionValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(rolesopcion);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
                .addContainerGap())
        );

        barraMenusCMP.setMinimumSize(new java.awt.Dimension(59, 21));
        barraMenusCMP.setPreferredSize(new java.awt.Dimension(59, 21));
        setJMenuBar(barraMenusCMP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mngrBarra1, javax.swing.GroupLayout.DEFAULT_SIZE, 1093, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mngrBarra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

      fin();

  }//GEN-LAST:event_formWindowClosing

    private void mngrBarra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngrBarra1ActionPerformed

        String cual = evt.getActionCommand().trim();
        if (cual.equals("ESC")) {
            fin();
            return;
        }
        getDatos().setIntercambio(null);
        refresh();

    }//GEN-LAST:event_mngrBarra1ActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        refresh();
    }//GEN-LAST:event_jList1ValueChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        getDatos().getIntercambio().toDestino();
        refresh();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        getDatos().getIntercambio().toOrigen();
        refresh();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void rolesopcionValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_rolesopcionValueChanged
        refresh();
    }//GEN-LAST:event_rolesopcionValueChanged
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenusCMP;
    private javax.swing.JTextField campoDescripcion;
    private javax.swing.JTextField campoId;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private es.cvjpy.componentes.MngrBarra mngrBarra1;
    private javax.swing.JList rolesopcion;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    private ModeloGuiPro auxiliar = new ModeloGuiPro(this);

    private void anadeMenu(JMenu este) {
        for (int j = 0; j < este.getMenuComponentCount(); j++) {
            Object menu = este.getMenuComponent(j);
            if (menu instanceof MenuElemento) {
                anadeMenuItemUI((MenuElemento) menu);
            } else {
                anadeMenu((JMenu) menu);
            }
        }
    }

    private void anadeMenuItemUI(MenuElemento este) {
        este.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                procesaritem(e);
            }
        });
    }

    private void procesaritem(ActionEvent e) {
        final ActionEvent evt = e;
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MenuElemento src = (MenuElemento) evt.getSource();
                try {
                    ejecutar(src);
                } catch (Exception ex) {
                    Logger.getLogger(MenuNodoMngrFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private void ejecutar(MenuElemento mitem) throws Exception {
        Cursor antes = this.getCursor();
        this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        llama(mitem);
        this.setCursor(antes);
    }
    private MenuElemento ultimo;

    private void llama(MenuElemento mitem) throws Exception {
        String name = mitem.getGui().getName();
        MenuNodo actual = getDatos().getEntidad(name);
        if (actual == null) {
            getDatos().nuevo();
            getDatos().getActual().setId(name);
            getDatos().setIntercambio(null);
            refresh();
            getDatos().guardar();
            actual = getDatos().getMngrCli().getActual();
        }
        getDatos().setLineaSelected(actual);
        getDatos().selecciona();

        this.campoDescripcion.setText(mitem.getText());
        getDatos().setIntercambio(null);
        refresh();
    }
    private JMenuBar barraMenu;
    public static final String PROP_BARRAMENU = "barraMenu";

    public JMenuBar getBarraMenu() {
        return barraMenu;
    }

    public void setBarraMenu(JMenuBar datos) {
        JMenuBar oldDatos = this.barraMenu;
        this.barraMenu = datos;
        MenuElement[] subElements = datos.getSubElements();
        for (MenuElement este : subElements) {
            JMenu cada = (JMenu) este;
            JMenu add = barraMenusCMP.add(cada);
            for (int j = 0; j < cada.getMenuComponentCount(); j++) {
                Object menu = cada.getMenuComponent(j);
                if (menu instanceof MenuElemento) {
                    anadeMenuItemUI((MenuElemento) menu);
                    ultimo = (MenuElemento) menu;
                } else {
                    anadeMenu((JMenu) menu);
                }
            }

        }
        firePropertyChange(PROP_BARRAMENU, oldDatos, datos);
    }
    private MenuNodoMngrCli datos;
    public static final String PROP_DATOS = "datos";

    public MenuNodoMngrCli getDatos() {
        return datos;
    }

    public void setDatos(MenuNodoMngrCli datos) {
        MenuNodoMngrCli oldDatos = this.datos;
        this.datos = datos;
        firePropertyChange(PROP_DATOS, oldDatos, datos);
    }

    @Override
    public void inicio(PrincipalUIPro padre) {
        auxiliar.inicio(padre);

        MenuNodoMngrCli prog = new MenuNodoMngrCli();
        prog.setPrincipalPro(padre.getServidor());
        prog.ultimo();
        setDatos(prog);
        mngrBarra1.setDatos(prog);

        setVisible(true);
        try {
            setBarraMenu(padre.getBarraMenu());
            llama(ultimo);
        } catch (Exception ex) {
            Logger.getLogger(MenuNodoMngrFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean puedosalir() {
        return auxiliar.puedosalir();
    }

    @Override
    public void fin() {
        if (puedosalir()) {
            auxiliar.fin();
        }
    }

    public void refresh() {
        firePropertyChange(PROP_DATOS, null, datos);
    }

    @Override
    public boolean isIniciado() {
        return auxiliar.isIniciado();
    }

    @Override
    public void rellama() {
        setState(0);
        setVisible(true);
    }
}
