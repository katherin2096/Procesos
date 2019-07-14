/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author josue
 */
@WebService(serviceName = "ServicioTienda")
public class ServicioTienda {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AgregarCategoria")
    public String AgregarCategoria(@WebParam(name = "id") int id, @WebParam(name = "nombre") String nombre) {
        return Local.Metodos.AgregarCategoria(id, nombre);        
    }
    
    @WebMethod(operationName = "AgregarCliente")
    public String AgregarCliente( @WebParam(name = "email") String email, @WebParam(name = "pass") String pass) {
        return Local.Metodos.AgregarCliente(email,pass);        
    }
}
