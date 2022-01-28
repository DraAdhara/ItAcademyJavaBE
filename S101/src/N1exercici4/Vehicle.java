package N1exercici4;

public class Vehicle {
    String marca, modelo, color;
    private final int ano;// se puede inicializar en el constructor de la clase, ver constructor 2
    private static int ruedas;// se puede inicializar en el constructor de la clase, ver constructor 2
    private int velocidad;
    private final static int velMax = 120;

    //Metodo constructor 1
    public Vehicle(String marca, String modelo) {
        this.marca  = marca;
        this.modelo = modelo;
        this.color  = "";
        this.ano    = 0;
        this.ruedas = 4;


    }

    //Metodo constructor 2
    public Vehicle(String marca, String modelo, String color, int ano, int ruedas, int velMax) {
        this.marca  = marca;
        this.modelo = modelo;
        this.color  = color;
        //inicializamos el atributo final int ano
        this.ano    = ano;
        //inicializamos el atributo static int ruedas
        this.ruedas = ruedas;
        /*
        No se puede inicializar el atributo final static int velMax en el constructor
        this.velMax = velMax;
        */


    }

    /*
    //Metodos Getter
        public String getMarca (){
            return this.marca;
        }
        public String getModelo(){
            return this.modelo;
        }
        public String getColor(){
            return this.color;
        }
        */
        public int getAno() {
            return this.ano;
        }

        public int getRuedas() {
            return this.ruedas;
        }
        /*
        public int getVelocidad() {
            return this.velocidad;
        }
        public int getVelMax() {
            return this.velMax;

    //Metodos Setter
        public void setMarca (String marca){
        this.marca = marca;
    }
        public void setModelo (String modelo){
            this.modelo = modelo;
        }
        public void setColor (String color){
            this.color = color;
        }

        public void setAno (int ano){
            this.ano = ano;
          }

*/

        public void setRuedas (int ruedas){
            this.ruedas = ruedas;
        }
        /*
        public void setVelocidad(int velocidad) {
            this.velocidad = velocidad;

        }


        public void setVelMax(int velMax) {
            this.velMax = velMax;
    */

    //Resto de metodos
    public void iniciar() {
        this.velocidad = (velocidad + 10);
        System.out.println("Mira como inicio:\nBruuuumm... voy a " + this.velocidad + "km/h.");
    }

    public static void parar() {
        System.out.println("Parada realizada.");
    }

    public void acelerar() {
        System.out.println("Acelerando...wiii");
    }
    public void presentacion (){
        System.out.println("Soy un coche marca " + this.marca + " modelo " + this.modelo + ", de color " + this.color
        + " del año " + this.ano + ". Tengo " + ruedas + " ruedas, una velocidad actual de " +this.velocidad
                + " y una velocidad máxima de " + velMax + ".");
    }
}

