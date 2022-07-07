package ec.edu.intsuperior.modelo;

import java.util.Date;

public class Persona {
    String ci;
    String nombre;
    String apellido;
    String direccion;
    Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String ci, String nombre, String apellido, String direccion, Date fechaNacimiento) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCi() {
        return ci;
    }

    public String getDireccion() {
        return direccion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Los datos del cliente son: \n"
                + "Cedula: "+getCi()+"\n"
                + "Nombre: "+getNombre()+"\n"
                + "Apellido: "+getApellido()+"\n"
                + "Direccion: "+getDireccion()+"\n";
                }
    
    
    


}
