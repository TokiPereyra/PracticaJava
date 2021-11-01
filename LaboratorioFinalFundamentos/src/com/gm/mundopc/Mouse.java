package com.gm.mundopc;

/**
 *
 * @author kali
 */
public class Mouse extends DispositivoEntrada{
    private final int idMouse;
    private static int contadorMouse;

    public Mouse(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idMouse = ++Mouse.contadorMouse;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mouse{idMouse=").append(idMouse);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    
    
}
