package N1exercici1;

import java.util.ArrayList;
import java.util.List;

public class Agencia {

    private List<IObserver> observers = new ArrayList<IObserver>();
    private int estado;


    /*Setter y getter de estado
    public void setEstado(int estado) {
        this.estado = estado;
    }
    public int getEstado(){
        return estado;
    }
    */

    //Metodo para agregar agencias al array observers
    public void nuevaAgencia (IObserver obs){
        observers.add(obs);
    }
    //Metodo para notificar a los observadores
    public void notificar(){
        for (IObserver observer : observers)
            observer.update();
    }
}
