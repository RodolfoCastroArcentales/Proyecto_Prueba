/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Date;

/**
 *
 * @author EQUINOX
 */
public class Cliente extends Persona{
    private String codigo;
    private Object rostroCliente;
    
    //------------------------------------------------------>Constructores
    public Cliente() {
    }

    public Cliente(String codigo, Object rostroCliente) {
        this.codigo = codigo;
        this.rostroCliente = rostroCliente;
    }

    public Cliente(String codigo, Object rostroCliente, String cedula, String nombres, String apellidos, Date fechaNacimiento, String direccion, String telefono) {
        super(cedula, nombres, apellidos, fechaNacimiento, direccion, telefono);
        this.codigo = codigo;
        this.rostroCliente = rostroCliente;
    }
    
    //------------------------------------------------------>Metodos Propios
    public void IniciarSesion(){
        
    }
    
    public void ConsultarEstadosCuentas(){
        
    }
    
    public void RealizarPagosServicio(){
        
    }
    
    public void RealizarDeposito(){
        
    }
    
    public void RealizarRetiro(){
        
    }
    
    public void CancelarCuentas(){
        
    }
}
