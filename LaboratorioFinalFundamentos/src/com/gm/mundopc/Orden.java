package 
        com.gm.mundopc;

/**
 *
 * @author kali
 */
public class Orden {
    private final int idOrden;
    private final Computadora computadoras[];
    private int contadorComputadoras;
    private static int contadorOrden;
    private static final int MAX_COMPUTADORAS = 5;
    
    public Orden() {
        this.idOrden = ++Orden.contadorOrden;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora) {
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        }
        else {
            System.out.println("La orden esta completa. Max. Computadoras: " + Orden.MAX_COMPUTADORAS);
        }
    }
    
    public void mostrarOrden() {
        System.out.println("Orden NRO " + this.idOrden);
        System.out.println("Productos:");
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println("Computadora[" + i + "] = " + this.computadoras[i]);
        }
    }
    
}
