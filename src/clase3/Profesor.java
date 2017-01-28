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
public class Profesor extends Empleado {

    int valorHora;
    String legajo;

    //metodo
    public void cobrarHora() {
        System.out.println("60");
    }

    //Metodo que lo llamo desde el main para que imprima
    @Override
    public void trabajar() {
        System.out.println("Estoy dando clases");
    }

    public Profesor(int valorHora, String legajo, String legago, String nombre, String apellido, String dni) {
        super(legago, nombre, apellido, dni);
        this.valorHora = valorHora;
        this.legajo = legajo;
    }

}
