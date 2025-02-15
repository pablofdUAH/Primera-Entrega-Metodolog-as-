package ent1.ejb.e3;

import ent1.ejb.e3.Author;

public class Book {

    // Zona de atributos
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    // Zona de constructores
    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        setPrice(price);
    }

    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        setPrice(price);
        setQty(qty);
    }

    // Zona de métodos: Getters
    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
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
    public String getAuthorName() {
        return author.getName();
    }

    @Override
    public String toString() {
        return "Book[isbn=" + isbn + ",name=" + name + author.toString() + ",price=" + price + ",qty=" + qty + "]";
    }
}
