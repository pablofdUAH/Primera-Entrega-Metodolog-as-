package ent1.ejb.e4;

public class Customer {

    // Zona de atributos
    private int id;
    private String name;
    private int discount;

    // Zona de constructor
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        setDiscount(discount);
    }

    // Zona de métodos: Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    // Zona de métodos: Setters
    public void setDiscount(int discount) {
        if (discount < 0){
            this.discount = 0;
        }else {
            this.discount = discount;
        }
    }

    // Zona de métodos: Otros
    @Override
    public String toString() {
        return name + "(" + id + ")" + "(" + discount + "%)";
    }
}

