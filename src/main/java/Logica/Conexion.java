package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * @author JEREMY
 */
public class Conexion {

    Connection conectar = null;
    Statement st;
    ResultSet rs;

    String usr;
    String pass; //Cambiar a P@ssW0rd
    String bd = "LocalPrueba";
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

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public boolean ingresar(String usr, String pass){
        this.usr = usr;
        this.pass = pass;
        return conectar()!= null;
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

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar datos de empleados: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
