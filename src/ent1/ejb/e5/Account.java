package ent1.ejb.e5;

public class Account {

    // Zona de atributos
    private int id;
    private Customer customer;
    private double balance;

    // Zona de constructores
    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        setBalance(balance);
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    // Zona de métodos: Getters
    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    // Zona de métodos: Setters
    public void setBalance(double balance) {
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    // Zona de métodos: Otros
    @Override
    public String toString() {
        return customer + " balance=$" + balance;
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    public void withdraw(double amount) {
        if (getBalance() < amount) {
            System.out.println("Amount withdrawn exceeds the current balance");
        } else {
            setBalance(getBalance() - amount);
        }
    }
}

