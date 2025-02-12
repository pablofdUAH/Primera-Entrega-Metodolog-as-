package ent1.ejb.e5;

public class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer, double balance){
        this.id = id;
        this.customer=customer;
        this.balance=balance;
    }
    public Account(int id, Customer customer){
        this.id=id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance<0){
            this.balance=0;
        }else{this.balance=balance;}

    }
    @Override
    public String toString(){
        return customer+" "+"balance=$"+balance;
    }

}
