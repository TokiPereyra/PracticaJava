/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

import dominio.Persona;

/**
 *
 * @author Cintia
 */
public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan" , 5000.00, false);
        
        persona1.setName("Juan Carlos");
        System.out.println(persona1.getName());
    }
}
