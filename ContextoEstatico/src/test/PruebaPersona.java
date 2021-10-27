/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Persona;

/**
 *
 * @author Tomás Emmanuel Pereyra
 */
public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        System.out.println("persona1 = " + persona1);
        
        Persona persona2 = new Persona("Maria");
        imprimir(persona2);
        
        System.out.println(Persona.getContador());
    }
    
    public static void imprimir(Persona persona) {
        System.out.println("persona = " + persona);
    }
}
