/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Tomas Emmanuel Pereyra
 */
public class Persona {
    
    private int idPersona;
    private String name;
    private static int contador;
    
    public Persona(String name) {
        this.name = name;
        Persona.contador++;
        this.idPersona = Persona.contador;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public static int getContador() {
        return contador;
    }

    public static void setContador(int aContador) {
        contador = aContador;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", name=" + name + '}';
    }
    
    
    
}
