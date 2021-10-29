package test;

import operaciones.Operaciones;

/**
 *
 * @author Tomás Emmanuel Pereyra
 */
public class TestOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(12, 7);
        System.out.println("resultado = " + resultado);
        
        var resultadoDouble = Operaciones.sumar(14.5, 4.7);
        System.out.println("resultadoDouble = " + resultadoDouble);
    }
}
