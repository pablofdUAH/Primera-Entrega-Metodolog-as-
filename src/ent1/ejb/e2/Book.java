package ent1.ejb.e2;

import java.util.Arrays;

public class Book {

    // Zona de atributos
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    // Zona de constructores
    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        setPrice(price);
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        setPrice(price);
        setQty(qty);
    }

    // Zona de métodos: Getters
    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    // Zona de métodos: Setters
    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public void setQty(int qty) {
        if (qty < 0) {
            this.qty = 0;
        } else {
            this.qty = qty;
        }
    }

    // Zona de métodos: Otros
    public String getAuthorNames() {
        String devuelvo = "";
        for (Author author : authors) {
            devuelvo = devuelvo + author.getName() + ",";
        }
        return devuelvo;
    }

    @Override
    public String toString() {
        return "Book[name=" + name + ",authors={" + Arrays.toString(authors) + "},price=" + price + ",qty=" + qty + "]";
    }
}

