package N1exercici4;

public class Objeto implements Comparable <Objeto>{

    private String variable;

    public Objeto (String variable) {
        this.variable = variable;
    }
@Override
    public String toString() {
        return "Objeto [variable= " + variable + "]";
    }
    public int compareTo(Objeto o) {
        return this.variable.compareTo(o.variable);
    }
}
