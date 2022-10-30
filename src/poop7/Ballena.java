/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase que de objetos que representan una ballena
 * @author Anvil
 */
public class Ballena extends AnimalAcuatico{
    private int largo;
    /**
     * Contructor vacio
     */
    public Ballena() {
    }
    /**
     * Constructor completo
     * @param largo Longitud en metros de la ballena
     * @param numeroAletas Cantidad de aletas
     * @param nombre Nombre del animal
     * @param lugarOrigen Zona endemica
     * @param color Color predominante en la piel de la ballena
     */
    public Ballena(int largo, int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(numeroAletas, nombre, lugarOrigen, color);
        this.largo = largo;
    }
    /**
     * Simulacion del la pelea contra pinocho
     */
    public void pelearConPinocho(){
        System.out.println("Pinocho gana con un combo brutal");
    }
}
