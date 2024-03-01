package GUI;

import Logica.Conexion;

/*
 * @author JEREMY
 */
public class Menu extends javax.swing.JFrame {
    Conexion con = new Conexion();
    Login log = new Login();
    String sede;

    public Menu(String sede) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.jLSede.setText("Sede de " + sede);
        this.sede = sede;
        String sql = """
                     SELECT tq.Id_taller, tq.nombre_taller, tq.telefono_taller, tq.ciudad, tq.id_director, eq.nombre_empleado, eq.apellido_empleado
                     FROM taller_quito tq
                     JOIN empleado_quito eq
                     ON tq.id_director = eq.idEmpleado""";
        con.datosCampos(sql, "taller", IDTaller, NombreT, TelTaller, Ciudad, IDDirector, NombreDir, ApeDir);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLogo = new javax.swing.JLabel();
        jLNombreTaller = new javax.swing.JLabel();
        jLSede = new javax.swing.JLabel();
        jBEmpleados = new javax.swing.JButton();
        jBVehiculos = new javax.swing.JButton();
        jBReparaciones = new javax.swing.JButton();
        jBClientes = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        IDTaller = new javax.swing.JTextField();
        NombreT = new javax.swing.JTextField();
        TelTaller = new javax.swing.JTextField();
        Ciudad = new javax.swing.JTextField();
        IDDirector = new javax.swing.JTextField();
        NombreDir = new javax.swing.JTextField();
        ApeDir = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLNombreTaller.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLNombreTaller.setText("Taller de automoviles José");

        jLSede.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLSede.setText("Sede ...");

        jBEmpleados.setText("Empleados");
        jBEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEmpleadosActionPerformed(evt);
            }
        });

        jBVehiculos.setText("Reparaciones");
        jBVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVehiculosActionPerformed(evt);
            }
        });

        jBReparaciones.setText("Vehículos");
        jBReparaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBReparacionesActionPerformed(evt);
            }
        });

        jBClientes.setText("Clientes");
        jBClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClientesActionPerformed(evt);
            }
        });

        jBSalir.setText("Cerrar Sesión");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Información del taller");

        jLabel3.setText("ID Taller:");

        jLabel4.setText("Nombre taller:");

        jLabel5.setText("Teléfono taller:");

        jLabel6.setText("Ciudad:");

        jLabel7.setText("ID director:");

        jLabel8.setText("Nombre director:");

        jLabel9.setText("Apellido director:");

        IDTaller.setEditable(false);
        IDTaller.setBackground(new java.awt.Color(255, 255, 255));

        NombreT.setEditable(false);
        NombreT.setBackground(new java.awt.Color(255, 255, 255));

        TelTaller.setEditable(false);
        TelTaller.setBackground(new java.awt.Color(255, 255, 255));

        Ciudad.setEditable(false);
        Ciudad.setBackground(new java.awt.Color(255, 255, 255));

        IDDirector.setEditable(false);
        IDDirector.setBackground(new java.awt.Color(255, 255, 255));

        NombreDir.setEditable(false);
        NombreDir.setBackground(new java.awt.Color(255, 255, 255));

        ApeDir.setEditable(false);
        ApeDir.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLSede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLNombreTaller, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBReparaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(16, 16, 16))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addGap(3, 3, 3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(NombreDir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(IDDirector, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Ciudad, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IDTaller)
                                    .addComponent(NombreT)
                                    .addComponent(TelTaller)
                                    .addComponent(ApeDir))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jLogo))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLogo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLNombreTaller, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLSede)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(69, 69, 69)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBReparaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBSalir))
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(IDTaller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NombreT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TelTaller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(7, 7, 7)
                                .addComponent(Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(IDDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NombreDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ApeDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        con.desconectar();
        this.setVisible(false);
        log.setVisible(true);
        
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEmpleadosActionPerformed
        Empleados emp = new Empleados(this.sede);
        emp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBEmpleadosActionPerformed

    private void jBReparacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBReparacionesActionPerformed
        AutomovilMatriculas auto = new AutomovilMatriculas(this.sede);
        auto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBReparacionesActionPerformed

    private void jBVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVehiculosActionPerformed
        Reparaciones rep = new Reparaciones(this.sede);
        rep.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBVehiculosActionPerformed

    private void jBClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClientesActionPerformed
        Clientes cli = new Clientes(this.sede);
        cli.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBClientesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApeDir;
    private javax.swing.JTextField Ciudad;
    private javax.swing.JTextField IDDirector;
    private javax.swing.JTextField IDTaller;
    private javax.swing.JTextField NombreDir;
    private javax.swing.JTextField NombreT;
    private javax.swing.JTextField TelTaller;
    private javax.swing.JButton jBClientes;
    private javax.swing.JButton jBEmpleados;
    private javax.swing.JButton jBReparaciones;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBVehiculos;
    private javax.swing.JLabel jLNombreTaller;
    private javax.swing.JLabel jLSede;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
