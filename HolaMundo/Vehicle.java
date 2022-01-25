public class Vehicle {

//atributos de la clase vehiculo
    String marca, modelo; color;
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
//Medoto constructor 2
    public Vehicle (String marca, String modelo, String color, int ano, int ruedas, int velMax){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.ano = ano;
        this.ruedas = ruedas;
        this.vekMax = velMax;
    }
//Metodos Getter

    public String getMarca (){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public String getColor(){
        return
    }
}
