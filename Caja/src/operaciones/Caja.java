package operaciones;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tomas Emmanuel Pereyra
 */
public class Caja {
    
    int alto, ancho, profundo;
    
    public static void main(String[] args) {
        
    }
    
    public Caja() {
        System.out.println("Constructor vacío.");
    }
    
    public Caja(int a, int b, int c) {
        this.alto = a;
        this.ancho = b;
        this.profundo = c;
    }
    
    public int calcularVolumen() {
        return ancho * alto * profundo;
    }
}
