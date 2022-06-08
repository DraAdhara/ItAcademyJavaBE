package cat.itacademy.barcelonactiva.dominguez.adhara.s04.t02.n01.model.domain;


import javax.persistence.*;

//The @Entity annotation specifies that the class is an entity and is mapped to a database table.
@Entity
//The @Table annotation specifies the name of the database table to be used for mapping.
//If you do not use @Table annotation in your entity, the default table name in the database will be the class name of the entity.
@Table
public class Fruita {
//The @Id annotation specifies the primary key of an entity and the @GeneratedValue provides for the specification of
// generation strategies for the values of primary keys.
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private int id;
    private String name;

//constructor
    public Fruita() {
    }

     public Fruita (int id, String name) {
        this.id     =    id;
        this.name   =    name;
}
//Getters
    public int getId(){
        return id;
}

    public String getName() {
        return name;
    }

//Setters
    public void setId(int id) {
        this.id = id;
}
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + "}";

    }
}
