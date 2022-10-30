/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Representacion de un perro
 * @author Anvil
 */
public class Perro extends AnimalTerrestre{
    private String colorCollar;
    /**
     * Constructor del perro
     */
    public Perro() {
    }
    /**
     * Constructor completo
     * @param colorCollar color del collar que tiene el perro
     * @param numeroPatas numero de patas con las que puede correr
     * @param nombre Nombre al que responde este animal
     * @param lugarOrigen Colonia en la que vive
     * @param color Color de su pelo
     */
    public Perro(String colorCollar, int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(numeroPatas, nombre, lugarOrigen, color);
        this.colorCollar = colorCollar;
    }
    /**
     * Accion de hacer un truco
     */
    public void hacerTrucos(){
        System.out.println("*Hace truco*");
    }
}
