package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * @author JEREMY
 */
public class Conexion {

    Connection conectar = null;

    String usr = "sa";
    String pass = "root"; //Cambiar a P@ssW0rd
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
}
