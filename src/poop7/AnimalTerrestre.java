/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase general de un animal terrestre
 * @author Anvil
 * Representacion abstracta de cualquier animal terrestre
 */
public class AnimalTerrestre extends Animal {
    private int numeroPatas;
    /**
     * Contructor vacio
     */
    public AnimalTerrestre() {
    }
    /**
     * Contructor completo
     * @param numeroPatas Numero de patas con las que corre
     * @param nombre Nombre del animal
     * @param lugarOrigen Zona de donde es originario el animal
     * @param color Color del animal
     */
    public AnimalTerrestre(int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroPatas = numeroPatas;
    }
    /**
     * Accion de correr con sus patas
     */
    public void correr(){
        System.out.println("Puedo correr porque tengo patas");
    }
    /**
     * Forma especial en que comen los animales terrestres
     */
    public void comer(){
        super.comer();
        System.out.println("Como soy un animal terrestre como mamiferos");
    }
}
