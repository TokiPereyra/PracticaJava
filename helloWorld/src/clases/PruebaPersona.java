/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Tomás Emmanuel Pereyra
 */
public class PruebaPersona {
    
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        
    }
    
}
