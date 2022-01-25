package N1exercici1;

public class Vehicle {

    String marca, modelo, color;
    int ano, ruedas, velMax;

    //Metodos constructor 1
    public Vehicle (String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.color = "";
        this.ano = 0;
        this.ruedas = 0;
        this.velMax = 0;
    }
    //Metodo constructor 2
    public Vehicle (String marca, String modelo, String color, int ano, int ruedas, int velMax){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.ano = ano;
        this.ruedas = ruedas;
        this.velMax = velMax;
    }
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
    public int getVelMax() {
        return this.velMax;
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
    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

 //Resto de metodos
   public void iniciar (){
        System.out.println("Mira como inicio:\nBruuuumm...");
   }

}
