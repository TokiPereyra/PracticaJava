package domain;

import java.util.Date;

/**
 *
 * @author Tomás Emmanuel Pereyra
 */
public class Cliente extends Persona {
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorClientes;

    public Cliente() {
        this.idCliente = ++Cliente.contadorClientes;
        this.fechaRegistro = new Date();
    }

    public Cliente(Date fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion) {
        this();
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
        this.vip = vip;
        this.fechaRegistro = fechaRegistro;
    }
    
    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
