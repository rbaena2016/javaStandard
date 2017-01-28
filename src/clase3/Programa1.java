/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

/** 
 * 
 *
 * @author educacionit
 */
public class Programa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Empleado e1= new Empleado ("juan","Perez","10","300");
       Administrativo a1 = new Administrativo (10,"408","Ramona","Perez","654654654");
       Profesor p1= new Profesor (10,"405","405","Pepe","Argento","30589698");
       
       e1.trabajar();
       p1.trabajar ();
       a1.cobrarHora ();
       p1.cobrarHora ();
    }
    
    
    
}
