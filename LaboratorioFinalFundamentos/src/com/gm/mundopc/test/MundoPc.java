package com.gm.mundopc.test;

import com.gm.mundopc.*;

/**
 *
 * @author kali
 */
public class MundoPc {
    public static void main(String[] args) {
        Teclado teclado1 = new Teclado("Bluetooth", "Samsung");
        Mouse mouse1 = new Mouse("USB", "Samsung");
        Monitor monitor1 = new Monitor("Samsung", 14);
        
        Teclado teclado2 = new Teclado("Bluetooth", "HP");
        Mouse mouse2 = new Mouse("USB", "HP");
        Monitor monitor2 = new Monitor("HP", 12);
        
        Computadora compu1 = new Computadora("Samsung", monitor1, teclado1, mouse1);
        Computadora compu2 = new Computadora("HP", monitor2, teclado2, mouse2);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(compu1);
        orden1.agregarComputadora(compu2);
        
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarComputadora(compu1);
        orden2.agregarComputadora(compu2);
        
        orden2.mostrarOrden();
        
    }
}
