package ent1.ejb.e5;

public class Customer {

    // Zona de atributos
    private int id;
    private String name;
    private char gender;

    // Zona de constructor
    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    // Zona de métodos: Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    // Zona de métodos: Setters
    public void setGender(char gender) {
        if (gender == 'm') {
            this.gender = 'm';
        } else {
            this.gender = 'f';
        }
    }

    // Zona de métodos: Otros
    @Override
    public String toString() {
        return name + "(" + id + ")";
    }
}

