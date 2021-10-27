package operaciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cintia
 */
public class PruebaCaja {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c;
        
        System.out.print("Ingrese la altura de la caja: ");
        a = Integer.parseInt(reader.readLine());
        
        System.out.print("Ingrese el ancho de la caja: ");
        b = Integer.parseInt(reader.readLine());
        
        System.out.print("Ingrese la profundidad de la caja: ");
        c = Integer.parseInt(reader.readLine());
        
        Caja caja1 = new Caja(a, b, c);
        
//        caja1.Caja(2, 3, 6);
        
        System.out.println("El volumen de la caja es de: " + caja1.calcularVolumen());
    }
}
