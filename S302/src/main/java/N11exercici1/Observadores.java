package N11exercici1;

import java.sql.SQLOutput;

public class Observadores implements IObserver{

    private String nombre;

    //Metodo constructor
    public Observadores (String nombre){
        this.nombre  =  nombre;
    }
    @Override
    public void update () {
        System.out.println("Se ha notificado al observador " + nombre + ".");
    }
}
