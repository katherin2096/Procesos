/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class consumir {
     public static String agregarCategoria(int id, java.lang.String nombre) {
        ServicioLocal.ServicioTienda_Service service = new ServicioLocal.ServicioTienda_Service();
        ServicioLocal.ServicioTienda port = service.getServicioTiendaPort();
        return port.agregarCategoria(id, nombre);
    }
       public static String agregarCliente(java.lang.String email, java.lang.String pass) {
        ServicioLocal.ServicioTienda_Service service = new ServicioLocal.ServicioTienda_Service();
        ServicioLocal.ServicioTienda port = service.getServicioTiendaPort();
        return port.agregarCliente(email, pass);
    }
}
