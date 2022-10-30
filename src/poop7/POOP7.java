/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;

/**
 * Paquete 
 * @author poo01alu39
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Gerente ger = new Gerente();
//        ger.setNombre("Pedro Escalante");
//        ger.setNumEmpleado(12345);
//        System.out.println("Nombre: "+ger.getNombre());
//        System.out.println("NumEmpleado: "+ger.getNumEmpleado());
//        System.out.println("Sueldo: "+ger.getSueldo());
//        
//        ger.setSueldo(10);
//        System.out.println("Sueldo aumentado: "+ger.getSueldo());
//        
//        ger.setPresupuesto(100_00);
//        System.out.println("Presupuesto: "+ger.getPresupuesto());
//        
//        System.out.println(ger);

        Animal animal = new Animal("mai","Mexico","cafe");
        animal.comer();
        animal.sonido("No se que animal soy");
        
        AnimalAcuatico aniAcua = new AnimalAcuatico(2,"OSMO","pacifico","azul");
        aniAcua.comer();
        aniAcua.sonido("creo soy un delfin");
        aniAcua.nadar();
        
        
        AnimalTerrestre aniT = new AnimalTerrestre(2,"MAS","Planeta tierra","purpura");
        aniT.comer();
        aniT.sonido("¿Por que soy purpura?");
        aniT.correr();
       
        
        AnimalAereo aniA = new AnimalAereo(2,"Fola","Australia","Amarillo");
        aniA.volar();
        
        
        Ballena b = new Ballena(20,2,"Acto","pacifico","gris");
        b.pelearConPinocho();
        b.nadar();
        b.sonido("Soy una ballena");
        
        
        Pajaro p = new Pajaro("Curvo",2,"Carlos","brazil","verde");
        p.volar();
        p.recolectarRamas();
        p.sonido("Soy un pajaro");
        
        
        Perro per = new Perro("Rojo",2,"Dog","Polanco","cafe");
        per.hacerTrucos();
        per.correr();
        per.sonido("Soy un perro");
    }
    
}
