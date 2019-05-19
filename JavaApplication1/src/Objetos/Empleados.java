
package Objetos;

import java.time.LocalDate;


public final class Empleados extends Persona{
    double Sueldo;
    String Departamento;

    public Empleados(String nombre, String apellidos, String dni, LocalDate fechaNac, double Sueldo, String Departamento ) {
        super(nombre, apellidos, dni, fechaNac);
        this.Sueldo = Sueldo;
        this.Departamento = Departamento;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }
 

    @Override
    public String toString() {
        return  super.toString()+"Sueldo: " + Sueldo + 
                "\r\nDepartamento: " + Departamento;
    }
    
    public double calculaRetencion(){
        return this.Sueldo*0.10;
        return this.Sueldo*0.05;
        
    }
    
    public double calculaRetencion(boolean casado) {
        if (casado) {
            return this.Sueldo*0.15;
        }else {
            return this.Sueldo*0.20;
        }
    }
    public double calculaRetencion(double sueldoFinal){
       return this.Sueldo- sueldoFinal; 
    }
    
    
}
