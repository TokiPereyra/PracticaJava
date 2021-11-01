package com.gm.mundopc;

/**
 *
 * @author kali
 */
public class Computadora {
    private final int idComputadora;
    private String name;
    private Monitor monitor;
    private Teclado teclado;
    private Mouse mouse;
    private static int contadorComputadora;
    
    private Computadora() {
        this.idComputadora = ++Computadora.contadorComputadora;
    }
    
    public Computadora(String name, Monitor monitor, Teclado teclado, Mouse mouse) {
        this();
        this.name = name;
        this.monitor = monitor;
        this.teclado = teclado;
        this.mouse = mouse;
    }

    public int getIdComputadora() {
        return this.idComputadora;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monitor getMonitor() {
        return this.monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return this.teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getMouse() {
        return this.mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computadora{idComputadora=").append(this.idComputadora);
        sb.append(", name=").append(this.name);
        sb.append(", monitor=").append(this.monitor);
        sb.append(", teclado=").append(this.teclado);
        sb.append(", mouse=").append(this.mouse);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
