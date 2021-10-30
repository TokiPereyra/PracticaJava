package test;

import domain.Persona;

/**
 *
 * @author Tomás Emmanuel Pereyra
 */
public class TestArreglosObjet {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Martín");
        
        System.out.println("personas[0] = " + personas[0]);
        System.out.println("personas[1] = " + personas[1]);
        
        for(int i = 0; i < personas.length; i++) {
            System.out.println("personas[" + i + "] = " + personas[i]);
        }
        
        String frutas[] = {"Banana", "Platano", "Kiwi"};
        
        for(int i = 0; i < frutas.length; i++) {
            System.out.println("frutas[" + i + "] = " + frutas[i]);
        }
    }
}
