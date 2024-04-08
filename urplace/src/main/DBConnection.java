package main;

import java.sql.*;

import java.util.logging.Level;
import java.util.logging.*;

public class DBConnection {
	
	//metodos
    public static Connection obtenerConexion() {
    	String connectionString = "jdbc:sqlserver://urplaceserver.database.windows.net:1433;database=UrPlaceDB;user=urPlaceRoot@urplaceserver;password={root123!};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
		Connection conn = null;

        try {
        	
        	System.out.println("Conectando a la BD");

            //1: Cargar el controlador JDBC
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            //2: Establecemos la conexion
            conn = DriverManager.getConnection(connectionString); 

            //3: Retornamos la conexion
            
            System.out.println("Conectado");
            return conn;

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
