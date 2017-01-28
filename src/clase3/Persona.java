package clase3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author educacionit
 */
public class Persona {
    String nombre;
    String apellido; 
    String dni;
    
    //metodo
    public void hablar(){
    System.out.println("Estoy hablando");
    
    }
//Este es mi constructor
    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        
    }

   
    
}
