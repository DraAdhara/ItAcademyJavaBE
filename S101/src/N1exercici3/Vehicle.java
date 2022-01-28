package N1exercici3;

public class Vehicle {

    private String marca, modelo, color;
    private int ano, ruedas, velocidad;

    /*Metodos constructor 1
    public Vehicle(String marca, String modelo) {
        this.marca     = marca;
        this.modelo    = modelo;
        this.color     = "";
        this.ano       = 0;
        this.ruedas    = 0;
        this.velocidad = 0;
    }
    */
    //Metodo constructor 2
    public Vehicle(String marca, String modelo, String color, int ano, int ruedas) {
        this.marca     = marca;
        this.modelo    = modelo;
        this.color     = color;
        this.ano       = ano;
        this.ruedas    = ruedas;
        this.velocidad = 0;
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
        public int getAno() {
            return this.ano;
        }
        public int getRuedas() {
            return this.ruedas;
        }
        public int getVelocidad() {
            return this.velocidad;
        }

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
        public void setRuedas (int ruedas){
            this.ruedas = ruedas;
        }
        public void setVelocidad(int velocidad) {
            this.velocidad = velocidad;
        }
    */
    //Resto de metodos
    public void iniciar() {
        this.velocidad = (velocidad + 10);
        System.out.println("Mira como inicio:\nBruuuumm... voy a " + this.velocidad + "km/h.");

    }
    public static void parar(){
        System.out.println("Parada realizada.");
    }

    public void acelerar(){
        System.out.println("Acelerando...wiii");
    }
}

