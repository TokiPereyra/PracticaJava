/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author Tomás Emmanuel Pereyra
 */
public class Aritmetica {
    
    int a, b;
    
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno() {
        return a + b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2) {
        a = arg1;
        b = arg2;
        return sumarConRetorno();
    }
}
