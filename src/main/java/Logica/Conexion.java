package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.table.DefaultTableModel;

/*
 * @author JEREMY
 */
public class Conexion {

    Connection conectar = null;
    Statement st;
    ResultSet rs;

    String usr = "sa";
    String pass = "root"; //Cambiar a P@ssW0rd
    String bd = "TALLER_QUITO";
    String port = "1433";
    String conString = "jdbc:sqlserver://localhost:" + port + ";databaseName=" + bd + ";encrypt=true;trustServerCertificate=true;";

    //Abrir conexion
    public Connection conectar() {
        try {
            conectar = DriverManager.getConnection(conString, usr, pass);
            System.out.println("Conexion correcta a la base de datos");
        } catch (SQLException e) {
            System.out.println("Error de conexion: " + e.toString());
        }
        return conectar;
    }

    //Cerrar conexion
    public void desconectar() {
        if (conectar != null) {
            try {
                conectar.close();
                System.out.println("Conexion cerrada");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion: " + e.toString());
            }
        }
    }

    //Login
    public boolean ingresar(String nodo, String usr, String pass) {
        if (nodo.equalsIgnoreCase(this.bd) && usr.equalsIgnoreCase(this.usr) && pass.equalsIgnoreCase(this.pass)) {
            return conectar() != null;
        }
        return false;
    }

    //Presentar tablas
    public void cargarDatos(String query, JTable jTabla, String selectTabla) {
        try {
            Conexion con = new Conexion();
            conectar = con.conectar();
            st = conectar.createStatement();
            rs = st.executeQuery(query);

            if (selectTabla.equals("empleados")) {
                Object[] empleado = new Object[3];
                DefaultTableModel tabla = new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{"ID", "Nombre", "Apellido"});
                while (rs.next()) {
                    empleado[0] = rs.getInt("idEmpleado");
                    empleado[1] = rs.getString("nombre_empleado");
                    empleado[2] = rs.getString("apellido_empleado");
                    tabla.addRow(empleado);
                }
                jTabla.setModel(tabla);
            }

            if (selectTabla.equals("reparaciones")) {
                Object[] reparacion = new Object[5];
                DefaultTableModel tabla = new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{"Id", "Matricula", "Tipo", "Precio", "Fecha"});
                while (rs.next()) {
                    reparacion[0] = rs.getInt("id_reparacion");
                    reparacion[1] = rs.getString("matricula");
                    reparacion[2] = rs.getString("tipo_reparacion");
                    reparacion[3] = rs.getString("precio_reparacion");
                    reparacion[4] = rs.getString("fecha_reparacion");
                    tabla.addRow(reparacion);
                }
                jTabla.setModel(tabla);
            }

            //Arreglar sede
            if (selectTabla.equals("clientes")) {
                Object[] cliente = new Object[3];
                DefaultTableModel tabla = new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{"Nombre", "Apellido"});
                while (rs.next()) {
                    cliente[0] = rs.getString("nombre_cliente");
                    cliente[1] = rs.getString("apellido_cliente");
                    tabla.addRow(cliente);
                }
                jTabla.setModel(tabla);
            }

            //Arreglar sede
            if (selectTabla.equals("automovilMatriculas")) {
                Object[] matricula = new Object[1];
                DefaultTableModel tabla = new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{"Matricula"});
                while (rs.next()) {
                    matricula[0] = rs.getString("matricula");
                    tabla.addRow(matricula);
                }
                jTabla.setModel(tabla);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar datos de: " + selectTabla + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Presentar los datos en los campos
    public void datosCampos(String query, String tabla, JTextField uno, JTextField dos, JTextField tres, JTextField cuatro, JTextField cinco, JTextField seis, JTextField siete) {
        try {
            Conexion con = new Conexion();
            conectar = con.conectar();
            st = conectar.createStatement();
            rs = st.executeQuery(query);

            if (tabla.equals("taller")) {
                while (rs.next()) {
                    if (uno != null) {
                        uno.setText("" + rs.getInt("Id_taller"));
                    }
                    if (dos != null) {
                        dos.setText(rs.getString("nombre_taller"));
                    }
                    if (tres != null) {
                        tres.setText(rs.getString("telefono_taller"));
                    }
                    if (cuatro != null) {
                        cuatro.setText("" + rs.getString("ciudad"));
                    }
                    if (cinco != null) {
                        cinco.setText("" + rs.getString("id_director"));
                    }
                    if (seis != null) {
                        seis.setText("" + rs.getString("nombre_empleado"));
                    }
                    if (siete != null) {
                        siete.setText("" + rs.getString("apellido_empleado"));
                    }
                }
            }

            if (tabla.equals("empleados")) {
                while (rs.next()) {
                    if (uno != null) {
                        uno.setText("" + rs.getInt("idEmpleado"));
                    }
                    if (dos != null) {
                        dos.setText(rs.getString("cedula_empleado"));
                    }
                    if (tres != null) {
                        tres.setText(rs.getString("nombre_empleado"));
                    }
                    if (cuatro != null) {
                        cuatro.setText("" + rs.getString("apellido_empleado"));
                    }
                    if (cinco != null) {
                        cinco.setText("" + rs.getString("fechaNac_empleado"));
                    }
                    if (seis != null) {
                        seis.setText("" + rs.getString("fechaInicio_Labores"));
                    }
                    if (siete != null) {
                        siete.setText("" + rs.getString("sueldo"));
                    }
                }
            }

            if (tabla.equals("clientes")) {
                while (rs.next()) {
                    if (uno != null) {
                        uno.setText("" + rs.getString("cedula_cliente"));
                    }
                    if (dos != null) {
                        dos.setText(rs.getString("nombre_cliente"));
                    }
                    if (tres != null) {
                        tres.setText(rs.getString("apellido_cliente"));
                    }
                    if (cuatro != null) {
                        cuatro.setText(rs.getString("ciudad_cliente"));
                    }
                    if (cinco != null) {
                        if (rs.getInt("Id_taller") == 1) {
                            cinco.setText("Quito");
                        } else {
                            cinco.setText("Guayaquil");
                        }
                    }
                }
            }

            if (tabla.equals("automovilMatriculas")) {
                while (rs.next()) {
                    if (uno != null) {
                        uno.setText("" + rs.getString("matricula"));
                    }
                    if (dos != null) {
                        dos.setText(rs.getString("fecha_compra"));
                    }
                    if (tres != null) {
                        tres.setText(rs.getString("marca"));
                    }
                    if (cuatro != null) {
                        cuatro.setText(rs.getString("tipo_vehiculo"));
                    }
                    if (cinco != null) {
                        if (rs.getInt("Id_taller") == 1) {
                            cinco.setText("Quito");
                        } else {
                            cinco.setText("Guayaquil");
                        }
                    }
                    if (seis != null) {
                        seis.setText(rs.getString("nombre_cliente"));
                    }
                    if (siete != null) {
                        siete.setText(rs.getString("apellido_cliente"));
                    }
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar datos: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Presentar los datos en los campos especiales
    public void datosCamposEspeciales(String query, String tabla, JSpinner ocho, JTextArea nueve) {
        try {
            Conexion con = new Conexion();
            conectar = con.conectar();
            st = conectar.createStatement();
            rs = st.executeQuery(query);

            ArrayList<String> valores = new ArrayList<>();

            while (rs.next()) {
                if (tabla.equals("empleados")) {
                    int numeroEmpleado = rs.getInt("telefono_empleado");
                    valores.add(String.valueOf(numeroEmpleado));
                    ocho.setModel(new SpinnerListModel(valores.toArray(new String[0])));
                }
                if (tabla.equals("reparaciones")) {
                    nueve.setText(rs.getString("observaciones"));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar datos: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Verificar conteos(duplicados o sedes)
    public int verificarConteo(String query) {
        try {
            Conexion con = new Conexion();
            conectar = con.conectar();
            st = conectar.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {
                return rs.getInt("Conteo");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar datos: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        return 0;
    }
    
    //Insertar en tablas.
    public boolean insertarTabla(String SQL, String tabla, String uno, String dos, String tres, String cuatro, String cinco, String seis, String siete, String ocho) {
        try {
            Conexion con = new Conexion();
            conectar = con.conectar();
            PreparedStatement pps = conectar.prepareStatement(SQL);
            
            if (tabla.equals("empleados")) {
                pps.setInt(1, Integer.parseInt(uno));
                pps.setString(2, dos);
                pps.setString(3, tres);
                pps.setString(4, cuatro);
                pps.setString(5, cinco);
                pps.setString(6, seis);
                pps.setDouble(7, Double.parseDouble(siete));
                pps.setInt(8, 1);
                pps.executeUpdate();
                return true;
            }
            
            if (tabla.equals("empleadosTelf"))
            {
                pps.setInt(1, Integer.parseInt(uno));
                pps.setString(2, ocho);
                pps.executeUpdate();
                return true;
            }
            
            if (tabla.equals("clienteNombres"))
            {
                pps.setString(1, uno);
                pps.setString(2, dos);
                pps.executeUpdate();
                return true;
            }
            
            if (tabla.equals("clienteDatos_quito"))
            {
                pps.setString(1, uno);
                pps.setString(2, dos);
                pps.setString(3, tres);
                pps.setString(4, cuatro);
                pps.setInt(5, 1);
                pps.executeUpdate();
                return true;
            }
            
            if (tabla.equals("automovilMatricula"))
            {
                pps.setString(1, uno);
                pps.executeUpdate();
                return true;
            }
            
            if (tabla.equals("automovilDatos_quito"))
            {
                pps.setString(1, uno);
                pps.setString(2, dos);
                pps.setString(3, tres);
                pps.setString(4, cuatro);
                pps.setInt(5, 1);
                pps.setString(6, seis);
                pps.setString(7, siete);
                pps.executeUpdate();
                return true;
            }
            
            if (tabla.equals("reparacion"))
            {
                pps.setInt(1, Integer.parseInt(uno));
                pps.setDouble(2, Double.parseDouble(dos));
                pps.setString(3, tres);
                pps.setString(4, cuatro);
                pps.setString(5, cinco);
                pps.setString(6, seis);
                pps.executeUpdate();
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar datos: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return false;
    }
}
