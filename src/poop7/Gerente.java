/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Representacion de un Gerente
 * @author poo01alu39
 */
public class Gerente extends Empleado {
    private int presupuesto;
    /**
     * Constructor vacio
     */
    public Gerente() {
    }
    /**
     * Constructor completo
     * @param presupuesto
     * @param nombre
     * @param numEmpleado
     * @param sueldo 
     */
    public Gerente(int presupuesto, String nombre, int numEmpleado, int sueldo) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }
    /**
     * Regresa de la cantidad de presupuesto
     * @return el valor del presupuesto
     */
    public int getPresupuesto() {
        return presupuesto;
    }
    /**
     * Modificacion del attr presupuesto
     * @param presupuesto 
     */
    public void setPresupuesto(int presupuesto) {
        if(presupuesto < 0)
            presupuesto = 0;
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return "Gerente{" + super.toString() + "presupuesto=" + presupuesto + '}';
    }
    
    
    
}
