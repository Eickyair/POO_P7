/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase general de un animal aereo
 * @author Anvil
 */
public class AnimalAereo extends Animal{
    private int numeroAlas;
    /**
     * Contructor vacio
     */
    public AnimalAereo() {
    }
    /**
     * Constructor completo
     * @param numeroAlas Cantidad de alas
     * @param nombre Nombre del animal
     * @param lugarOrigen Region de donde es esta clase de animal
     * @param color Color predominante en la piel
     */
    public AnimalAereo(int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }
    /**
     * Accion de volar con sus alas
     */
    public void volar(){
        System.out.println("Como tengo alas puedo volar");
    }
    /**
     * Forma especial en que comen los animales voladores
     */
    public void comer(){
        super.comer();
        System.out.println("Los animales aereos comen gusanos");
    }
}
