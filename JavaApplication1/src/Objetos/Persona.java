
package Objetos;

import java.time.*;

public  class Persona {
    String nombre;
    String apellidos;
    String dni;
    LocalDate fechaNac;

    public Persona(String nombre, String apellidos, String dni, LocalDate fechaNac) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\r\nApellidos: " + apellidos +
                "\r\nDNI: " + dni +
                "\r\nfechaNac: " + fechaNac +
                "\r\n";
    }
    
}



