
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tomás Emmanuel Pereyra
 * @version 1.0
 */
public class HelloWorld {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new  InputStreamReader(System.in));

        int calificacion;
        
        System.out.print("Proporciona un valor entre 0 y 10: ");
        calificacion = Integer.parseInt(reader.readLine());
        
        if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("A");
        }
        else if (calificacion >=8 && calificacion < 9) {
            System.out.println("B");
        }
        else if (calificacion >=7 && calificacion < 8) {
            System.out.println("C");
        }
        else if (calificacion >=6 && calificacion < 7) {
            System.out.println("D");
        }
        else if (calificacion >=0 && calificacion < 6) {
            System.out.println("F");
        }
    }
}
