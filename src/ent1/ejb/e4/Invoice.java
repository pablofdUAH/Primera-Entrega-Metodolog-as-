package ent1.ejb.e4;

public class Invoice {

    // Zona de atributos
    private int id;
    private Customer customer;
    private double amount;

    // Zona de constructor
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        setAmount(amount);
    }

    // Zona de métodos: Getters
    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public int getCustomerId() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        return amount - (amount * getCustomerDiscount() / 100);
    }

    // Zona de métodos: Setters
    public void setAmount(double amount) {
        if (amount < 0){
            this.amount = 0;
        }else {
            this.amount = amount;
        }
    }

    // Zona de métodos: Otros
    @Override
    public String toString() {
        return "Invoice[id=" + id + ",customer=" + customer + ",amount=" + amount + "]";
    }
}

