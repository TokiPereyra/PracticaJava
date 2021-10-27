/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

import dominio.Persona;

/**
 *
 * @author Tomás Emmanuel Pereyra
 */
public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan" , 5000.00, false);
        System.out.println("persona1 nombre: " + persona1.getName());
        
        persona1.setName("Juan Carlos");
//        System.out.println("persona1 nombre con cambio: " + persona1.getName());
//        
//        System.out.println("persona1 sueldo: " + persona1.getSueldo());
//        System.out.println("persona1 eliminado: " + persona1.isEliminado());
        
        System.out.println("persona1: " + persona1);
    }
}
