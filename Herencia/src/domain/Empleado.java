/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Tomás Emmanuel Pereyra
 */
public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado() {
        this.idEmpleado = ++Empleado.contadorEmpleado;        
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    
    public Empleado(String nombre, double sueldo) {
        this();
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public Empleado(String nombre, char genero) {
        this();
        this.nombre = nombre;
        this.genero = genero;
    }

    public Empleado(String nombre, char genero, int edad) {
        this();
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
    }

    public Empleado(String nombre, char genero, int edad, String direccion) {
        this();
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
