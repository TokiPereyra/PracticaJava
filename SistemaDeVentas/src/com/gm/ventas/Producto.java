package com.gm.ventas;

/**
 *
 * @author kali
 */
public class Producto {
    private final int idProducto;
    private String name;
    private double precio;
    private static int contadorId;

    private Producto() {
        this.idProducto = ++Producto.contadorId;
    }
    
    public Producto(String name, double precio) {
        this();
        this.name = name;
        this.precio = precio;
    }

    public int getIdProducto() {
        return this.idProducto;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{idProducto=").append(idProducto);
        sb.append(", name=").append(name);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
    
}
