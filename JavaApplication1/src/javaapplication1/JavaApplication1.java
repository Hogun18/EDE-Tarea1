
package javaapplication1;
import Objetos.*;
import java.time.*;
public class JavaApplication1 {

    public static void main(String[] args) {
       Persona[] personas = new Persona [3];
       LocalDate miFecha = LocalDate.of(1983, 3, 12);
       LocalDate tuFecha = LocalDate.of(1990, 4, 12);
       LocalDate suFecha = LocalDate.of(1987, 8, 12);
       personas[0] = new Empleados("Luis", "Ros", "48135486N", miFecha, 1200, "Informática" );
       personas[1] = new Persona ("Jose", "Herrero", "48135486N", tuFecha );
       personas[2] = new Empleados("Miguel", "", "48135486N", suFecha, 2000, "Informática" );
       
       //Castear explicito ((Empleados)
       System.out.println("La retención es: "
       + ((Empleados)personas [0]).calculaRetencion(800));
       
       for(int i=0; i<personas.length;i++){
        System.out.println(personas[i].toString()); 
        System.out.println("-----------");
       }
       
    }
    
}
