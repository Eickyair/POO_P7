/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Representacion de un Pajaro
 * @author Anvil
 */
public class Pajaro extends AnimalAereo{
    private String tipoPico;
    /**
     * Contructor vacio
     */
    public Pajaro() {
    }
    /**
     * Constructor Completo
     * @param tipoPico Forma del pico que tiene el pajaro
     * @param numeroAlas Cantidad de alas que tiene
     * @param nombre Nombre del pajaro
     * @param lugarOrigen Zona de donde es endemica
     * @param color Color dominate del pajaro
     */
    public Pajaro(String tipoPico, int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(numeroAlas, nombre, lugarOrigen, color);
        this.tipoPico = tipoPico;
    }
    /**
     * Accion de juntar ramas para un nido
     */
    public void recolectarRamas(){
        System.out.println("*Recolecta ramas*");
    }
}
