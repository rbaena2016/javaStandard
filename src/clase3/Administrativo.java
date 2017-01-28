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
public class Administrativo extends Empleado {
    
    int sueldo;
    
     //metodo
    public void cobrarHora(){
    System.out.println("50");
    }

    public Administrativo(int sueldo, String legago, String nombre, String apellido, String dni) {
        super(legago, nombre, apellido, dni);
        this.sueldo = sueldo;
    }

    
    
    
}
