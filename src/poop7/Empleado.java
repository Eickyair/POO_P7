/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Representacion de un empleado
 * @author poo01alu39
 */
public class Empleado {
    private String nombre;
    private int numEmpleado, sueldo;
    
    /**
     * Constructor vacio
     */
    public Empleado() {
        this.sueldo = 10_000;
    }
    /**
     * Constructor completo
     * @param nombre Nombre del empleado
     * @param numEmpleado Numero identificador del empleado
     * @param sueldo Cantidad de dinero que gana al mes
     */
    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }
/**
 * 
 * @return Regresa el nombre del Empleado 
 */
    public String getNombre() {
        return nombre;
    }
/**
 * 
 * @return Regresa el numero del empleado
 */
    public int getNumEmpleado() {
        return numEmpleado;
    }
/**
 * 
 * @return Regresa el sueldo del empleado 
 */
    public int getSueldo() {
        return sueldo;
    }
/**
 * Metodo que modifica el valor del nombre 
 * @param nombre El  nombre de un empleado
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * Metodo que modifica el numero del empleado
 * @param numEmpleado El numero de empleado
 */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
/**
 * Metodo que modifica el incremento del sueldo
 * @param porcentaje 
 */
    public void setSueldo(int porcentaje) {
        this.sueldo  += (int)(this.sueldo * porcentaje/100);
    }

    @Override
    public String toString() {
        return "Empleado{" +super.toString()+ "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }

    
    
}
