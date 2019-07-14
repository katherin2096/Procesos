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
 * @author josue
 */
public class Main {
    
    public static void main(String[] args) {
//          BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        //int id = -1;
        Connection cn = null;

        try {
            // Carga el driver de oracle
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            
            // Conecta con la base de datos XE con el usuario system y la contraseña password
            cn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.64:1521:XE", "GATITO", "kuroshiro");
            
            System.out.println(cn.isClosed());
            // Llamada al procedimiento almacenado
            CallableStatement cst = cn.prepareCall("{call CrearCategoria (?,?)}");         
            
            cst.setInt(1, 5);
            cst.setString(2, "perros");
            System.out.println(cst.execute());
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            try {
                cn.close();
            } catch (SQLException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }    
    }
    
}
