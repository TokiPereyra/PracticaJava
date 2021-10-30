package com.gm.ventas;

/**
 *
 * @author kali
 */
public class Orden {
    private final int idOrden;
    private Producto productos[];
    private static int contadorId;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorId;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }
    
    public void agregarProducto(Producto producto) {
        if(this.contadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos] = producto;
            ++this.contadorProductos;
        }
        else {
            System.out.println("El carrito está lleno");
        }
    }
    
    public double calcularTotal() {
        double total = 0;
        for(int i = 0; i < this.contadorProductos; i++) {
//            Producto producto = this.productos[i];
//            total += producto.getPrecio();
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("Nro.Orden " + this.idOrden);
        System.out.println("Productos:");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
        System.out.println("Total $" + this.calcularTotal());
    }
    
}
