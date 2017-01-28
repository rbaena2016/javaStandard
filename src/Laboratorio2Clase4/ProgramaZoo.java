/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio2Clase4;

/**
 *
 * @author educacionit
 */
public class ProgramaZoo {
    
    public static void main(String[] args) {
        Zoologico z1= new Zoologico ();
        Zoologico z2= new Zoologico ();
        Cuidador c1 = new Cuidador();
        
        z1.abrir();
        z1.cerrar();
        c1.alimentarAnimales();
        
    }
        
}
