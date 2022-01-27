package N1exercici4;

public class Main {

    public static void main(String[] args) {
    /*Exercici 4. A la classe Vehicle afegeix un camp static final, un camp final i un camp static. Demostra la diferència
    entre els tres. Quins es poden inicialitzar al constructor de la classe?
     */
    Vehicle coche1 = new Vehicle("Opel", "Corsa");
    Vehicle coche2 = new Vehicle("Seat", "León", "Gris", 2010, 4, 130);

    /*DEMOSTRACIÓN STATIC
    Para demostrar el campo static, vamos a modificar el valor Ruedas de cada uno de los objetos Vehicle,
    y al imprimir el valor ruedas de coche1 , veremos que el resultado es el último asignado al coche2,
    ya que es un espacio de memoria compartido entre todos los objetos de la clase.
    Se puede modificar el valor del atributo pero será común a todos los objetos de la clase.
    Ver clase Vehicle para comprobar
    Utilizamos el constructor dos en coche2 para demostrar que static ruedas se puede inicializar con el constructor
    */
    coche1.setRuedas(2);

    coche2.setRuedas(5);

        System.out.println("***DEMOSTRACIÓN STATIC*** \n"  +
                "Soy el coche1 y tengo " + coche1.getRuedas() + " ruedas.");

    /*DEMOSTRACIÓN FINAL
    Para demostrar el campo final, creamos el objeto Vehicle coche3 y coche4 utilizando el metodo constructor 2.
    Llamamos al metodo presentacion para comprobar que no comparten valor en el atributo ano.
    Al intentar modificar el valor y correr el programa nos saltaría el error
    "java: cannot assign a value to final variable ano".
    Al usar el constructor 2 se comprueba que el valor final ano se puede inicializar en el constructor
*/

        Vehicle coche3 = new Vehicle("Renault", "Clio", "Azul", 1986, 4, 50);
        Vehicle coche4 = new Vehicle("Renault", "Arkana", "Rojo", 2005, 4,120);

        coche3.presentacion();
        coche4.presentacion();

        //coche3.ano = 1990;

        /*DEMOSTRACIÓN FINAL STATIC
        Hemos instanciado los objetos Vehicle coche2, coche3 y coche4 pasando diversos parametros para velMax,
        pero al tratarse de un atributo FINAL, el valor sigue siendo el mismo con el que se ha creado en Vehicle
        y además es compartido por todos los objetos de la clase Vehicle al ser STATIC (ver presentación).
        */
        coche1.presentacion();
        coche2.presentacion();
    }

}

