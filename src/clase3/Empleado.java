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
public   class Empleado extends Persona {
    String legago;
    
    //Metodo que lo llamo desde el main para que imprima
    public void  trabajar(){
        System.out.println("Estoy trabajando");
        
        
        
}

    public Empleado(String legago, String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.legago = legago;
    }

    
    
}
