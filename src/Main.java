import ent1.eja.e1.Circle;
import ent1.eja.e2.Rectangle;
import ent1.eja.e3.Employee;
import ent1.eja.e4.InvoiceItem;
import ent1.eja.e5.Account;
import ent1.eja.e6.Date;
import ent1.eja.e7.Time;

public class Main {
    public static void main(String[] args) {
        ent1_eja_e8();
    }

    static public void ent1_eja_e1(){
        // Test Constructors and toString()
        Circle c1 = new Circle(1.1);
        System.out.println(c1); // toString()
        Circle c2 = new Circle(); // default constructor
        System.out.println(c2);
// Test setter and getter
        c1.setRadius(2.2);
        System.out.println(c1); // toString()
        System.out.println("radius is: " + c1.getRadius());
// Test getArea() and getCircumference()
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());
    }

    static public void ent1_eja_e2(){
        // Test constructors and toString()
// You need to append a 'f' or 'F' to a float literal
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        System.out.println(r1); // toString()
        Rectangle r2 = new Rectangle(); // default constructor
        System.out.println(r2);
// Test setters and getters
        r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1); // toString()
        System.out.println("length is: " + r1.getLength());
        System.out.println("width is: " + r1.getWidth());
// Test getArea() and getPerimeter()
        System.out.printf("area is: %.2f%n", r1.getArea());
        System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
    }

    static public void ent1_eja_e3(){
        // Test constructor and toString()
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(e1); // toString();
// Test Setters and Getters
        e1.setSalary(999);
        System.out.println(e1); // toString();
        System.out.println("id is: " + e1.getId());
        System.out.println("firstname is: " + e1.getFirstName());
        System.out.println("lastname is: " + e1.getLastName());
        System.out.println("salary is: " + e1.getSalary());
        System.out.println("name is: " + e1.getName());
        System.out.println("annual salary is: " + e1.getAnnualSalary()); // Test method
// Test raiseSalary()
        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);
    }

    static public void ent1_eja_e4(){
        // Test constructor and toString()
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(inv1); // toString();
// Test Setters and Getters
        inv1.setQty(999);
        inv1.setUnitPrice(0.99);
        System.out.println(inv1); // toString();
        System.out.println("id is: " + inv1.getId());
        System.out.println("desc is: " + inv1.getDesc());
        System.out.println("qty is: " + inv1.getQty());
        System.out.println("unitPrice is: " + inv1.getUnitPrice());
// Test getTotal()
        System.out.println("The total is: " + inv1.getTotal());
    }

    static public void ent1_eja_e5(){
        // Test constructor and toString()
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(a1); // toString();
        Account a2 = new Account("A102", "Kumar"); // default balance
        System.out.println(a2);
// Test Getters
        System.out.println("ID: " + a1.getID());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());
// Test credit() and debit()
        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500); // debit() error
        System.out.println(a1);
// Test transfer()
        a1.transferTo(a2, 100); // toString()
        System.out.println(a1);
        System.out.println(a2);
    }

    static public void ent1_eja_e6(){
        // Test constructor and toString()
        Date d1 = new Date(1, 2, 2014);
        System.out.println(d1); // toString()
// Test Setters and Getters
        d1.setMonth(12);
        d1.setDay(9);
        d1.setYear(2099);
        System.out.println(d1); // toString()
        System.out.println("Month: " + d1.getMonth());
        System.out.println("Day: " + d1.getDay());
        System.out.println("Year: " + d1.getYear());
// Test setDate()
        d1.setDate(3, 4, 2016);
        System.out.println(d1); // toString()
    }

    static public void ent1_eja_e7(){
        // Test constructors and toString()
        Time t1 = new Time(1, 2, 3);
        System.out.println(t1); // toString()
// Test Setters and Getters
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1); // toString()
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());
// Test setTime()
        t1.setTime(23, 59, 58);
        System.out.println(t1); // toString()
// Test nextSecond();
        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond());
// Test previousSecond()
        System.out.println(t1.previousSecond());
        System.out.println(t1.previousSecond().previousSecond());
    }

    static public void ent1_eja_e8(){
        // Test constructors and toString()
        Time t1 = new Time(1, 2, 3);
        System.out.println(t1); // toString()
// Test Setters and Getters
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1); // toString()
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());
// Test setTime()
        t1.setTime(23, 59, 58);
        System.out.println(t1); // toString()
// Test nextSecond();
        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond());
// Test previousSecond()
        System.out.println(t1.previousSecond());
        System.out.println(t1.previousSecond().previousSecond());
    }
}

