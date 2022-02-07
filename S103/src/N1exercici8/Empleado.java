package N1exercici8;

public class Empleado {

    private String name;
    private String categoria;

    public Empleado(String name, String categoria) {
        this.name = name;
        this.categoria = categoria;

    }
//metodos getter
    public String getName() {
        return name;
    }

    public String getCategoria() {
        return categoria;
    }
//metodos setter
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setName(String name) {
        this.name = name;
    }

@Override
    public String toString() {
        return "Empleado [name= " +name+ " categoria= " +categoria+ "]";
    }
}

