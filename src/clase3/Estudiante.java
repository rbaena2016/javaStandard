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
public class Estudiante extends Persona {
    
    String matricula;

    public Estudiante(String matricula, String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.matricula = matricula;
    }

    
    
    
    
}
