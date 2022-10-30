/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase general de un animal acuatico
 * @author Anvil
 */
public class AnimalAcuatico extends Animal {
     
    private int numeroAletas;
    /**
     * Contructor vacio
     */
    public AnimalAcuatico() {
    }
    /**
     * Constructor completo
     * @param numeroAletas Cantidad de aletas que tiene el animal
     * @param nombre Nombre al que responde
     * @param lugarOrigen Zona de donde es
     * @param color Color predominante
     */
    public AnimalAcuatico(int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAletas = numeroAletas;
    }
     
    
    
    /**
     * Accion de nadar con sus aletas
     */
    public void nadar(){
        System.out.println("Como soy un un animal acuatico puedo nadar");
    }
    /**
     * Accion de comer para los animales acuaticos
     */
    public void comer(){
        super.comer();
        System.out.println("Como peces");
    }
}
