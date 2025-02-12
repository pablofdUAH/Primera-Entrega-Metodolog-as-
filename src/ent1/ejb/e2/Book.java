package ent1.ejb.e2;

import java.util.Arrays;

public class Book {

    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;


    public Book(String name, Author[] authors, double price){

        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    public Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

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



    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public String getAuthorNames(){
        String devuelvo="";
        for (Author author:authors){
            devuelvo = devuelvo + author.getName()+",";
        }
        return devuelvo;
    }


    @Override
    public String toString(){
        //return "Book[isbn="+isbn+",Author[name="+author.getName()+",email="+author.getEmail()+"],price="+price+",qty="+qty+"]";
        return     "Book[name="+name+",authors={"+ Arrays.toString(authors)+"}"+",price="+price+",qty="+qty+"]";
    }
}
