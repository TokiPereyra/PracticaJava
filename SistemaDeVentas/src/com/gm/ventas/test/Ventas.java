package com.gm.ventas.test;

import com.gm.ventas.Orden;
import com.gm.ventas.Producto;


/**
 *
 * @author kali
 */
public class Ventas {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 50.00);
        Producto producto2 = new Producto("Pantalón", 100.00);
        
        Orden orden = new Orden();
        orden.agregarProducto(producto1);
        orden.agregarProducto(producto2);
        
        orden.mostrarOrden();
    }    
}
