/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Tomas Emmanuel Pereyra
 */
public class Persona {
    private String name;
    private double sueldo;
    private boolean eliminado;
    
    public Persona(String name, double sueldo, boolean eliminado) {
        this.name = name;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getSueldo() {
        return this.sueldo;
    }
    
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public boolean isEliminado() {
        return this.eliminado;
    }
    
    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    public String toString() {
        return "Persona [Nombre: " + this.name + ", sueldo: " + this.sueldo + ", eliminado: " + this.eliminado + "]";
    }
}
