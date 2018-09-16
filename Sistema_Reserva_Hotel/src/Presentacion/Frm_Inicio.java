
package Presentacion;


public class Frm_Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Frm_Inicio
     */
    public Frm_Inicio() {
        initComponents();
        //maximizando el formulario al 100%
        this.setExtendedState(Frm_Inicio.MAXIMIZED_BOTH);
        this.setTitle("Sistema de Reserva de Habitaciones y Gestión de ventas - Hotel Paraíso");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        lblnombre = new javax.swing.JLabel();
        lblacceso = new javax.swing.JLabel();
        lblidpersona = new javax.swing.JLabel();
        lblamaterno = new javax.swing.JLabel();
        lblapaterno = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuSisReserva = new javax.swing.JMenu();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        menuArchivo = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        menuReservas = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenu();
        menuConfiguraciones = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuHerramientas = new javax.swing.JMenu();
        menuAyuda = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(204, 204, 204));

        lblnombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblnombre.setText("jLabel1");
        escritorio.add(lblnombre);
        lblnombre.setBounds(30, 55, 140, 20);

        lblacceso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblacceso.setText("jLabel1");
        escritorio.add(lblacceso);
        lblacceso.setBounds(30, 150, 120, 15);

        lblidpersona.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblidpersona.setText("jLabel1");
        escritorio.add(lblidpersona);
        lblidpersona.setBounds(30, 30, 140, 20);

        lblamaterno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblamaterno.setText("jLabel1");
        escritorio.add(lblamaterno);
        lblamaterno.setBounds(30, 120, 130, 15);

        lblapaterno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblapaterno.setText("jLabel1");
        escritorio.add(lblapaterno);
        lblapaterno.setBounds(30, 90, 120, 15);

        menuSisReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Inicio.png"))); // NOI18N
        menuSisReserva.setMnemonic('f');
        menuSisReserva.setText("Sisreserva");

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        menuSisReserva.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        menuSisReserva.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        menuSisReserva.add(exitMenuItem);

        menuBar.add(menuSisReserva);

        menuArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Archivo.png"))); // NOI18N
        menuArchivo.setMnemonic('e');
        menuArchivo.setText("Archivo");

        cutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        cutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/habitaciones.png"))); // NOI18N
        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Habitaciones");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        menuArchivo.add(cutMenuItem);

        copyMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        copyMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/productos.png"))); // NOI18N
        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Productos");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        menuArchivo.add(copyMenuItem);

        menuBar.add(menuArchivo);

        menuReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Reservas.png"))); // NOI18N
        menuReservas.setMnemonic('h');
        menuReservas.setText("Reservas");

        contentMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        contentMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/reservas-consumos.png"))); // NOI18N
        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Reservas y Consumos");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        menuReservas.add(contentMenuItem);

        aboutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        aboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/clientes.png"))); // NOI18N
        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Clientes");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        menuReservas.add(aboutMenuItem);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/pagos.png"))); // NOI18N
        jMenuItem1.setText("Pagos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuReservas.add(jMenuItem1);

        menuBar.add(menuReservas);

        menuConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Consultas.png"))); // NOI18N
        menuConsultas.setText("Consultas");
        menuBar.add(menuConsultas);

        menuConfiguraciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Configuraciones.png"))); // NOI18N
        menuConfiguraciones.setText("Configuraciones");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/trabajadores.png"))); // NOI18N
        jMenuItem2.setText("Usuarios y Accesos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuConfiguraciones.add(jMenuItem2);

        menuBar.add(menuConfiguraciones);

        menuHerramientas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Herramientas.png"))); // NOI18N
        menuHerramientas.setText("Herramientas");
        menuBar.add(menuHerramientas);

        menuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Ayuda.png"))); // NOI18N
        menuAyuda.setText("Ayuda");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Acerca de los desarrolladores");
        menuAyuda.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Ayuda");
        menuAyuda.add(jMenuItem4);

        menuBar.add(menuAyuda);

        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Salir.png"))); // NOI18N
        menuSalir.setText("Salir");
        menuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSalirMouseClicked(evt);
            }
        });
        menuBar.add(menuSalir);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        // 
        Frm_Habitacion form = new Frm_Habitacion();
        escritorio.add(form);//en el JDesktopPane agrega al frmhabitaciones
        form.toFront();//el form aparesca al frente
        form.setVisible(true);
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        Frm_Producto form = new Frm_Producto();
        escritorio.add(form);//en el JDesktopPane agrega al form
        form.toFront();//el form aparesca al frente
        form.setVisible(true);
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
        //llamando al form reserva
        Frm_Reserva form = new Frm_Reserva();
        escritorio.add(form);//en el JDesktopPane agrega al form
        form.toFront();//el form aparesca al frente
        form.setVisible(true);
        
        //jalando los datos del trabajador logueado y se almacenara esos datos(id, nombre) en los campos de texto del Frm_Reserva
        Frm_Reserva.txtidTrabajador.setText(lblidpersona.getText());
        Frm_Reserva.txtTrabajador.setText(lblnombre.getText()+" "+lblapaterno.getText());
        Frm_Reserva.idusuario = Integer.parseInt(lblidpersona.getText());
    }//GEN-LAST:event_contentMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        Frm_Cliente form = new Frm_Cliente();
        escritorio.add(form);//en el JDesktopPane agrega al form
        form.toFront();//el form aparesca al frente
        form.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Frm_Trabajador form = new Frm_Trabajador();
        escritorio.add(form);//en el JDesktopPane agrega al form
        form.toFront();//el form aparesca al frente
        form.setVisible(true);
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_menuSalirMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    public static javax.swing.JLabel lblacceso;
    public static javax.swing.JLabel lblamaterno;
    public static javax.swing.JLabel lblapaterno;
    public static javax.swing.JLabel lblidpersona;
    public static javax.swing.JLabel lblnombre;
    public static javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenuBar menuBar;
    public static javax.swing.JMenu menuConfiguraciones;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenu menuHerramientas;
    private javax.swing.JMenu menuReservas;
    private javax.swing.JMenu menuSalir;
    private javax.swing.JMenu menuSisReserva;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
