
package Presentacion;

import Datos.DHabitacion;
import Datos.DReserva;
import Logica.LHabitacion;
import Logica.LReserva;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Frm_Reserva extends javax.swing.JInternalFrame {

    
    public Frm_Reserva() {
        initComponents();
        mostrar("");
        inhabilitar();
    }
    
    
    private String accion = "guardar";//determina si la accion a realizar es guardar o ditar
    public static int idusuario; 
    
    
    
    void ocultarColumnas(){
        //ocultando comuna 0 idreserva
        tablaListado.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaListado.getColumnModel().getColumn(0).setMinWidth(0);
        tablaListado.getColumnModel().getColumn(0).setPreferredWidth(0);
        //ocultando columna 1 idhabitacion
        tablaListado.getColumnModel().getColumn(1).setMaxWidth(0);
        tablaListado.getColumnModel().getColumn(1).setMinWidth(0);
        tablaListado.getColumnModel().getColumn(1).setPreferredWidth(0);
        //ocultando columna 3 idcliente
        tablaListado.getColumnModel().getColumn(3).setMaxWidth(0);
        tablaListado.getColumnModel().getColumn(3).setMinWidth(0);
        tablaListado.getColumnModel().getColumn(3).setPreferredWidth(0);
        //ocultando columna idtrabajador
        tablaListado.getColumnModel().getColumn(5).setMaxWidth(0);
        tablaListado.getColumnModel().getColumn(5).setMinWidth(0);
        tablaListado.getColumnModel().getColumn(5).setPreferredWidth(0);
    }
    
    
    void inhabilitar(){
        
        txtidreserva.setVisible(false);
        txtidhabitacion.setVisible(false);
        txtidCliente.setVisible(false);
        txtidTrabajador.setVisible(false);
                
        txtNumeroHabitacion.setEnabled(false);
        txtCliente.setEnabled(false);
        txtTrabajador.setEnabled(false);
        cbotipoReserva.setEnabled(false);
        dcFechaReserva.setEnabled(false);
        dcFechaIngreso.setEnabled(false);
        dcFechaSalida.setEnabled(false);
        txtcostoAlojaminto.setEnabled(false);
        cboEstadoReserva.setEnabled(false);

        
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnBuscaCliente.setEnabled(false);
        btnBuscaHabitacion.setEnabled(false);
        
        txtidreserva.setText("");
        txtidhabitacion.setText("");
        txtidCliente.setText("");
        txtNumeroHabitacion.setText("");
        txtcostoAlojaminto.setText("");
        txtCliente.setText("");
        //txtTrabajador.setText("");
    }
    
    
    void habilitar(){
        
        txtidreserva.setVisible(false);
        txtidhabitacion.setVisible(false);
        txtidCliente.setVisible(false);
        txtidTrabajador.setVisible(false);
                
        txtNumeroHabitacion.setEnabled(false);
        txtCliente.setEnabled(false);
        txtTrabajador.setEnabled(false);
        
        cbotipoReserva.setEnabled(true);
        dcFechaReserva.setEnabled(true);
        dcFechaIngreso.setEnabled(true);
        dcFechaSalida.setEnabled(true);
        txtcostoAlojaminto.setEnabled(true);
        cboEstadoReserva.setEnabled(true);

        
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnBuscaCliente.setEnabled(true);
        btnBuscaHabitacion.setEnabled(true);
        
        txtidreserva.setText("");
        txtidhabitacion.setText("");
        txtidCliente.setText("");
        txtNumeroHabitacion.setText("");
        txtcostoAlojaminto.setText("");
        txtCliente.setText("");
    }
    
    
    void mostrar(String buscar){
        
        try {
            DefaultTableModel modelo;
            
            LReserva func = new LReserva();
            
            modelo = func.mostrar(buscar);
            
            tablaListado.setModel(modelo);
            ocultarColumnas();
            
            lblTotalRegistros.setText("Total de Registros: "+func.totalRegistros);
            
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }

    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaListado = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblTotalRegistros = new javax.swing.JLabel();
        btnVerConsumo = new javax.swing.JButton();
        btnRealizarPagos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtidreserva = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtidhabitacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbotipoReserva = new javax.swing.JComboBox<>();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtcostoAlojaminto = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cboEstadoReserva = new javax.swing.JComboBox<>();
        txtNumeroHabitacion = new javax.swing.JTextField();
        txtidCliente = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtidTrabajador = new javax.swing.JTextField();
        txtTrabajador = new javax.swing.JTextField();
        dcFechaReserva = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        dcFechaIngreso = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        dcFechaSalida = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        btnBuscaHabitacion = new javax.swing.JButton();
        btnBuscaCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(27, 38, 21));
        jLabel1.setText("Reserva");

        jPanel4.setBackground(new java.awt.Color(255, 255, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de Reserva de Habitaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        tablaListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaListado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaListadoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaListado);

        jLabel9.setText("Buscar:");

        btnBuscar.setBackground(new java.awt.Color(51, 51, 51));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(51, 51, 51));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/salir.gif"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblTotalRegistros.setText("Total Registros:");

        btnVerConsumo.setText("Ver Consumo");
        btnVerConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerConsumoActionPerformed(evt);
            }
        });

        btnRealizarPagos.setText("Realizar Pagos");
        btnRealizarPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPagosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnBuscar)
                .addGap(27, 27, 27)
                .addComponent(btnEliminar)
                .addGap(27, 27, 27)
                .addComponent(btnSalir)
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVerConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnRealizarPagos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotalRegistros)
                .addGap(21, 21, 21))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerConsumo)
                    .addComponent(btnRealizarPagos))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Reserva de Habitaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel4.setText("Habitacion:");

        txtidhabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidhabitacionActionPerformed(evt);
            }
        });

        jLabel5.setText("Cliente");

        jLabel6.setText("Tipo de Reserva:");

        cbotipoReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reserva", "Alquiler" }));
        cbotipoReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotipoReservaActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(51, 51, 51));
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/nuevo.GIF"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(51, 51, 51));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel10.setText("Fecha de Reserva:");

        txtcostoAlojaminto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcostoAlojamintoActionPerformed(evt);
            }
        });

        jLabel14.setText("Estado Reserva:");

        cboEstadoReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alquiler", "Pagada", "Anulada" }));
        cboEstadoReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstadoReservaActionPerformed(evt);
            }
        });

        txtNumeroHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroHabitacionActionPerformed(evt);
            }
        });

        txtidCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidClienteActionPerformed(evt);
            }
        });

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        jLabel8.setText("Trabajador:");

        txtidTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidTrabajadorActionPerformed(evt);
            }
        });

        txtTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrabajadorActionPerformed(evt);
            }
        });

        jLabel18.setText("Fecha de Ingreso:");

        jLabel19.setText("Fecha de Salida:");

        jLabel20.setText("Costo de alojamiento:");

        btnBuscaHabitacion.setText("...");
        btnBuscaHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaHabitacionActionPerformed(evt);
            }
        });

        btnBuscaCliente.setText("...");
        btnBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel8))
                                    .addGap(31, 31, 31)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel20)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboEstadoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNumeroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBuscaHabitacion)
                                    .addComponent(btnBuscaCliente)))
                            .addComponent(dcFechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtidTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTrabajador))
                            .addComponent(txtidreserva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcostoAlojaminto, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbotipoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnNuevo)
                .addGap(29, 29, 29)
                .addComponent(btnGuardar)
                .addGap(31, 31, 31)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(txtidreserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNumeroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscaHabitacion)
                        .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscaCliente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtidTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(txtTrabajador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbotipoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(dcFechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dcFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dcFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtcostoAlojaminto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cboEstadoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaListadoMouseClicked
        // al dar click en un registro de la tabla
        btnGuardar.setText("Editar");
        habilitar();
        btnEliminar.setEnabled(true);
        accion="editar";

        int fila=tablaListado.rowAtPoint(evt.getPoint());//almacenando de la tablalistado la fila donde he hecho click

        //capturar los datos de c/u d ela columna de la tabla para mandarlo a las cajas de texto
        txtidreserva.setText(tablaListado.getValueAt(fila, 0).toString());
        txtidhabitacion.setText(tablaListado.getValueAt(fila, 1).toString());
        txtNumeroHabitacion.setText(tablaListado.getValueAt(fila, 2).toString());
        txtidCliente.setText(tablaListado.getValueAt(fila, 3).toString());
        txtCliente.setText(tablaListado.getValueAt(fila, 4).toString());
        txtidTrabajador.setText(tablaListado.getValueAt(fila, 5).toString());
        txtTrabajador.setText(tablaListado.getValueAt(fila, 6).toString());        
        cbotipoReserva.setSelectedItem(tablaListado.getValueAt(fila, 7).toString());
        dcFechaReserva.setDate(Date.valueOf(tablaListado.getValueAt(fila, 8).toString()));
        dcFechaIngreso.setDate(Date.valueOf(tablaListado.getValueAt(fila, 9).toString()));
        dcFechaSalida.setDate(Date.valueOf(tablaListado.getValueAt(fila, 10).toString()));
        txtcostoAlojaminto.setText(tablaListado.getValueAt(fila, 11).toString());
        cboEstadoReserva.setSelectedItem(tablaListado.getValueAt(fila, 12).toString());
        
    }//GEN-LAST:event_tablaListadoMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        mostrar(txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if(!txtidreserva.getText().equals("")){//si no esta vacio

            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de eliminar la reserva?","Confirmar",2);

            if(confirmacion==0){
                //proceder a eliminar
                LReserva func = new LReserva();
                DReserva dts = new DReserva();

                dts.setIdreserva(Integer.parseInt(txtidreserva.getText()));

                func.eliminar(dts);
                mostrar("");
                inhabilitar();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrabajadorActionPerformed

    private void txtidTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidTrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidTrabajadorActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtidClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidClienteActionPerformed

    private void txtNumeroHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroHabitacionActionPerformed

    private void cboEstadoReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstadoReservaActionPerformed
        cboEstadoReserva.transferFocus();
    }//GEN-LAST:event_cboEstadoReservaActionPerformed

    private void txtcostoAlojamintoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcostoAlojamintoActionPerformed
        txtcostoAlojaminto.transferFocus();
    }//GEN-LAST:event_txtcostoAlojamintoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if(txtidhabitacion.getText().length() == 0){
            JOptionPane.showConfirmDialog(rootPane, "Debes seleccionar una habitación");
            txtidhabitacion.requestFocus();//pon el foco
            return;
        }
        if(txtidCliente.getText().length() == 0){
            JOptionPane.showConfirmDialog(rootPane, "Debes seleccionar un cliente");
            txtidCliente.requestFocus();//pon el foco
            return;
        }
        if(txtcostoAlojaminto.getText().length() == 0){
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un costo del alojamiento");
            txtcostoAlojaminto.requestFocus();//pon el foco
            return;
        }

        DReserva dts = new DReserva();
        LReserva func = new LReserva();

        //enviando los datos de los campos a los metodos setter
        dts.setIdhabitacion(Integer.parseInt(txtidhabitacion.getText()));
        dts.setIdcliente(Integer.parseInt(txtidCliente.getText()));
        dts.setIdtrabajador(idusuario);//almacena el codigo dl usuario logueado
        int seleccionado = cbotipoReserva.getSelectedIndex();//almacenando lo q he seleccionado
        dts.setTipo_reserva((String)cbotipoReserva.getItemAt(seleccionado));
        
        Calendar calendario;
        int dia, mes, anio;
        calendario = dcFechaReserva.getCalendar();//obteniendo la fcha seleccionada
        dia = calendario.get(Calendar.DAY_OF_MONTH);//obteniendo el dia del mes
        mes = calendario.get(Calendar.MONTH);//obteniendo el mes
        anio = calendario.get(Calendar.YEAR) - 1900;//obteniendo el año
        dts.setFecha_reserva(new Date(anio,mes,dia));
        
        calendario = dcFechaIngreso.getCalendar();//obteniendo la fcha seleccionada
        dia = calendario.get(Calendar.DAY_OF_MONTH);//obteniendo el dia del mes
        mes = calendario.get(Calendar.MONTH);//obteniendo el mes
        anio = calendario.get(Calendar.YEAR) - 1900;//obteniendo el año
        dts.setFecha_ingresa(new Date(anio,mes,dia));
        
        calendario = dcFechaSalida.getCalendar();//obteniendo la fcha seleccionada
        dia = calendario.get(Calendar.DAY_OF_MONTH);//obteniendo el dia del mes
        mes = calendario.get(Calendar.MONTH);//obteniendo el mes
        anio = calendario.get(Calendar.YEAR) - 1900;//obteniendo el año
        dts.setFecha_salida(new Date(anio,mes,dia));
        
        dts.setCosto_alojamiento(Double.parseDouble(txtcostoAlojaminto.getText()));
        seleccionado = cboEstadoReserva.getSelectedIndex();
        dts.setEstado((String) cboEstadoReserva.getItemAt(seleccionado));
        

        //determinar si la accion a realizar es editar o guardar
        if(accion.equals("guardar")){
            if(func.insertar(dts)){
                JOptionPane.showMessageDialog(rootPane, "La reserva fue registrado satisfactoriamente!");
                mostrar("");
                inhabilitar();
                
                //ocupamos la Habitación alquilada
                LHabitacion func3= new LHabitacion();
                DHabitacion dts3 = new DHabitacion();
                
                dts3.setIdhabitacion(Integer.parseInt(txtidhabitacion.getText()));
                func3.ocupar(dts3);
                mostrar("");
            }

        }else if(accion.equals("editar")){

            dts.setIdreserva(Integer.parseInt(txtidreserva.getText()));
            dts.setIdtrabajador(Integer.parseInt(txtidTrabajador.getText()));

            if(func.editar(dts)){
                JOptionPane.showMessageDialog(rootPane, "La reserva fue editado correctamente!");
                mostrar("");
                inhabilitar();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habilitar();
        btnGuardar.setText("Guardar");
        accion="guardar";
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void cbotipoReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipoReservaActionPerformed
        cbotipoReserva.transferFocus();
    }//GEN-LAST:event_cbotipoReservaActionPerformed

    private void txtidhabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidhabitacionActionPerformed
        txtidhabitacion.transferFocus();//al dar enter pasa al sgte elemento
    }//GEN-LAST:event_txtidhabitacionActionPerformed

    private void btnBuscaHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaHabitacionActionPerformed
        Frm_ConsultarHabitacion form = new Frm_ConsultarHabitacion();
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btnBuscaHabitacionActionPerformed

    private void btnBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaClienteActionPerformed
        Frm_ConsultarCliente form = new Frm_ConsultarCliente();
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btnBuscaClienteActionPerformed

    private void btnVerConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerConsumoActionPerformed
        //
        int fila = tablaListado.getSelectedRow();//obteniendo la fila que el usuario ha hecho click
        Frm_Consumo.idreserva = tablaListado.getValueAt(fila, 0).toString();//enviando a la variable idreserva ....
        Frm_Consumo.cliente = tablaListado.getValueAt(fila, 4).toString();//enviando a la variable cliente lo que hay en la columna 4 de la fila seleccionada
        
        Frm_Consumo form = new Frm_Consumo();
        Frm_Inicio.escritorio.add(form);//al frm_inicio agrega el frm_consumo
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btnVerConsumoActionPerformed

    private void btnRealizarPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPagosActionPerformed
        //enviando todas las variables a Frm_pago
        int fila = tablaListado.getSelectedRow();
        
        Frm_Pago.idreserva = tablaListado.getValueAt(fila, 0).toString();
        Frm_Pago.cliente = tablaListado.getValueAt(fila, 4).toString();
        Frm_Pago.totalreserva = Double.parseDouble(tablaListado.getValueAt(fila, 11).toString());

        Frm_Pago.idhabitacion = tablaListado.getValueAt(fila, 1).toString();
        Frm_Pago.habitacion = tablaListado.getValueAt(fila, 2).toString();
        
        Frm_Pago form = new Frm_Pago();
        Frm_Inicio.escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        mostrar("");
    }//GEN-LAST:event_btnRealizarPagosActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Reserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscaCliente;
    private javax.swing.JButton btnBuscaHabitacion;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRealizarPagos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerConsumo;
    private javax.swing.JComboBox<String> cboEstadoReserva;
    private javax.swing.JComboBox<String> cbotipoReserva;
    private com.toedter.calendar.JDateChooser dcFechaIngreso;
    private com.toedter.calendar.JDateChooser dcFechaReserva;
    private com.toedter.calendar.JDateChooser dcFechaSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblTotalRegistros;
    private javax.swing.JTable tablaListado;
    private javax.swing.JTextField txtBuscar;
    public static javax.swing.JTextField txtCliente;
    public static javax.swing.JTextField txtNumeroHabitacion;
    public static javax.swing.JTextField txtTrabajador;
    private javax.swing.JTextField txtcostoAlojaminto;
    public static javax.swing.JTextField txtidCliente;
    public static javax.swing.JTextField txtidTrabajador;
    public static javax.swing.JTextField txtidhabitacion;
    private javax.swing.JTextField txtidreserva;
    // End of variables declaration//GEN-END:variables
}
