
package Clases;

import java.sql.Date;

public abstract class Persona {
    private String cedula;
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;
    private String direccion;
    private String telefono;

    public Persona() {
    }
    
    public Persona(String cedula, String nombres, String apellidos, Date fechaNacimiento, String direccion, String telefono) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    
}
