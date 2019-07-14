/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Local;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 
 */
public class Metodos {
    public static String AgregarCliente(String email, String pass )
    {
        String respuesta= "OK";
         Connection cn = null;

        try {
            // Carga el driver de oracle
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "GATITO", "kuroshiro");                        
            // Llamada al procedimiento almacenado
            CallableStatement cst = cn.prepareCall("{call CrearCliente (?,?)}");                     
           
            cst.setString(1, email);
            cst.setString(2, pass);
            cst.execute();
        } catch (SQLException ex) {
            respuesta = "Error: " + ex.getMessage();
        } finally {
            try {
                cn.close();
            } catch (SQLException ex) {
                respuesta = "Error: " + ex.getMessage();
            }
        }    
        return respuesta;
    }
    
     public static String AgregarCategoria(int id, String nombre )
    {
        String respuesta= "OK";
         Connection cn = null;

        try {
            // Carga el driver de oracle
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "GATITO", "kuroshiro");                        
            // Llamada al procedimiento almacenado
            CallableStatement cst = cn.prepareCall("{call CrearCategoria (?,?)}");                     
            cst.setInt(1, id);
            cst.setString(2, nombre);
            
            cst.execute();
        } catch (SQLException ex) {
            respuesta = "Error: " + ex.getMessage();
        } finally {
            try {
                cn.close();
            } catch (SQLException ex) {
                respuesta = "Error: " + ex.getMessage();
            }
        }    
        return respuesta;
    }
    
    
}

