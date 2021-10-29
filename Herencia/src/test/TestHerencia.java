/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

/**
 *
 * @author Tomás Emmanuel Pereyra
 */
public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Tomás", 5000.0);
        empleado1.setGenero('M');
        empleado1.setEdad(18);
        empleado1.setDireccion("Ushuaia");
        System.out.println("empleado1 = " + empleado1);
        
        Cliente cliente1 = new Cliente(new Date(), true, "Martin", 'M', 17, "Ushuaia");
        System.out.println("cliente1 = " + cliente1);
    }
}
