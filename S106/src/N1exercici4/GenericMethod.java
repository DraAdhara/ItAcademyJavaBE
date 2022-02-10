package N1exercici4;

import java.util.Arrays;

public class GenericMethod <T> {

    private T d1;
    private T d2;
    private T d3;

    //Argumento de longitud variable
    public void f(T... v) {
        System.out.println(Arrays.toString(v));
    }
}