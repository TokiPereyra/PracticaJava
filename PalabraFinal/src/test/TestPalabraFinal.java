package test;

import domain.Persona;

/**
 *
 * @author Tomás Emmanuel Pereyra
 */
public class TestPalabraFinal {
    public static void main(String[] args) {
        final int a = 10;
        System.out.println("a = " + a);
        
        final Persona persona1 = new Persona();
        
//        persona1 = new Persona();
        
        persona1.setName("Juan");//Se puede cambiar los valores del objeto pero nos e puede cambiar la referencia.
        System.out.println("persona1 = " + persona1.getName());
        
        persona1.setName("Carlos");
        System.out.println("persona1 = " + persona1.getName());
    }
}
