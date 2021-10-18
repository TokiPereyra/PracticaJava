package operaciones;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cintia
 */
public class PruebaCaja {
    public static void main(String[] args) {
        Caja caja1 = new Caja(2, 3, 6);
        
//        caja1.Caja(2, 3, 6);
        
        System.out.println("El volumen de la caja es de: " + caja1.calcularVolumen());
    }
}
