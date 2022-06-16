package cat.itacademy.barcelonactiva.dominguez.adhara.s04.t02.n01.model.domain;


import javax.persistence.*;

//The @Entity annotation specifies that the class is an entity and is mapped to a database table.
@Entity
//The @Table annotation specifies the name of the database table to be used for mapping. (not mandatory)

@Table (name = "fruites")
public class Fruita {
//The @Id annotation specifies the primary key of an entity and the @GeneratedValue provides for the specification of
// generation strategies for the values of primary keys.
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private int id;
    private String name;
    private int qKilos;


//constructors
    public Fruita() {
    }

     public Fruita (int id, String name, int qKilos) {
        this.id     =    id;
        this.name   =    name;
        this.qKilos =    qKilos;
}
//Getters
    public int getId(){
        return id;
}

    public String getName() {
        return name;
    }

    public int getqKilos(){
        return qKilos;
    }

//Setters
    public void setId(int id) {
        this.id = id;
}
    public void setName(String name) {
        this.name = name;
    }

    public void setqKilos(int qKilos){
        this.qKilos = qKilos;
    }
    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id + ", name='" + name + ", quantity= " + qKilos + " kilograms}";

    }
}
