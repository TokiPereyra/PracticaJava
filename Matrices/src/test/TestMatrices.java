package test;

import domain.Persona;

/**
 *
 * @author Tomás Emmanuel Pereyra
 */
public class TestMatrices {
    public static void main(String[] args) {
//        int edades[][] = new int[3][2];
//        
//        System.out.println("edades = " + edades);
//        
//        edades[0][0] = 10;
//        edades[0][1] = 7;
//        edades[1][0] = 8;
//        edades[1][1] = 5;
//        edades[2][0] = 4;
//        edades[2][1] = 15;
        
//        System.out.println("edades[0][0] = " + edades[0][0]);
//        System.out.println("edades[1][0] = " + edades[0][1]);
//        System.out.println("edades[0][0] = " + edades[1][0]);
//        System.out.println("edades[1][0] = " + edades[1][1]);
//        System.out.println("edades[0][0] = " + edades[2][0]);
//        System.out.println("edades[1][0] = " + edades[2][1]);
    
//        for(int i = 0; i < edades.length; i++) {
//            for(int a = 0; a < edades[i].length; a++) {
//                System.out.println("edades[" + i + "][" + a + "] = " + edades[i][a]);
//            }
//        }
//        
//        String frutas[][] = {{"Manzana", "Banana", "Pera"},{"Tomate", "Kiwi", "Naranja"},{"Limon", "Frutilla", "Uva"}};
//        for(int i = 0; i < frutas.length; i++) {
//            for( int a = 0; a < frutas[i].length; a++) {
//                System.out.println("frutas[" + i + "][" + a + "] = " + frutas[i][a]);
//            }
//        }
        
        Persona personas[][] = {{new Persona("Juan"), new Persona("Marta"), new Persona("Joaquin")},{new Persona("Tomas"), new Persona("Camilo"), new Persona("Cintia")},{new Persona("Pilar"), new Persona("Gianna"), new Persona("Raul")}};

        imprimir(personas);
//        for(int i = 0; i < personas.length; i++) {
//            for(int a = 0; a < personas[i].length; a++) {
//                System.out.println("personas[" + i + "][" + a + "] = " + personas[i][a]);
//            }
//        }
    }
    
    public static void imprimir(Object matriz[][]) {
        for(int i = 0; i < matriz.length; i++) {
            for(int a = 0; a < matriz[i].length; a++) {
                System.out.println("matriz[" + i + "][" + a + "] = " + matriz[i][a]);
            }
        }
    }
}
