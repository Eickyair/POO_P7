/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase general de un animal
 * @author Anvil
 */
public class Animal {
    private String nombre;
    private String lugarOrigen;
    private String color;
    /**
     * Contructor vacio
     */
    public Animal() {
    }
    /**
     * Constructor completo
     * @param nombre Nombre del animal
     * @param lugarOrigen Zona de donde es originario
     * @param color Color con mayor presencia en su cuerpo
     */
    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }
    /**
     * 
     * @param dialogo Sonido que se debe producir
     */
    public void sonido(String dialogo){
        System.out.println(""+this.nombre+":"+dialogo);
    }
    /**
     * Accion de comer
     */
    public void comer(){
        System.out.println("Metodo comer llamado por "+this.nombre);
    }
}
