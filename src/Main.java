import ent1.eja.e1.Circle;
import ent1.eja.e2.Rectangle;
import ent1.eja.e3.Employee;
import ent1.eja.e4.InvoiceItem;
import ent1.eja.e5.Account;
import ent1.eja.e6.Date;
import ent1.eja.e7.Time;
import ent1.eja.e8.Ball;
import ent1.ejb.e1.Author;
import ent1.ejb.e1.Book;
import ent1.ejb.e4.Customer;
import ent1.ejb.e4.Invoice;
import ent1.ejb.e6.MyPoint;
import ent1.ejb.e8.MyCircle;

public class Main {
    public static void main(String[] args) {
        ent1_ejb_e8();
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
        // Test constructor and toString()
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        System.out.println(ball); // toString()
// Test Setters and Getters
        ball.setX(80.0f);
        ball.setY(35.0f);
        ball.setRadius(5);
        ball.setXDelta(4.0f);
        ball.setYDelta(6.0f);
        System.out.println(ball); // toString()
        System.out.println("x is: " + ball.getX());
        System.out.println("y is: " + ball.getY());
        System.out.println("radius is: " + ball.getRadius());
        System.out.println("xDelta is: " + ball.getXDelta());
        System.out.println("yDelta is: " + ball.getYDelta());
        float xMin = 0.0f;
        float xMax = 100.0f;
        float yMin = 0.0f;
        float yMax = 50.0f;
        for (int i = 0; i < 15; i++) {
            ball.move();
            System.out.println(ball);
            float xNew = ball.getX();
            float yNew = ball.getY();
            int radius = ball.getRadius();
// Check boundary value to bounce back
            if ((xNew + radius) > xMax || (xNew - radius) < xMin) {
                ball.reflectHorizontal();
            }
            if ((yNew + radius) > yMax || (yNew - radius) < yMin) {
                ball.reflectVertical();
            }
        }

    }

    static public void ent1_ejb_e1(){
        // Construct an author instance
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck); // Author's toString()
        Book dummyBook = new Book("Java for dummy", ahTeck,19.95,99); // Test Book's Constructor
        System.out.println(dummyBook); // Test Book's toString()
// Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor()); // Author's toString(
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());
// Use an anonymous instance of Author to construct a Book instance
        Book anotherBook = new Book("more Java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook); // toString()
    }

    static public void ent1_ejb_e2(){
        // Declare and allocate an array of Authors
        ent1.ejb.e2.Author[] authors = new ent1.ejb.e2.Author[2];
        authors[0] = new ent1.ejb.e2.Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new ent1.ejb.e2.Author("Paul Tan", "Paul@nowhere.com", 'm');
// Declare and allocate a Book instance
        ent1.ejb.e2.Book javaDummy = new ent1.ejb.e2.Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy); // toString()
    }
    static public void ent1_ejb_e3(){


// Test Author class
                ent1.ejb.e3.Author a1 = new ent1.ejb.e3.Author("Tan Ah Teck", "ahteck@nowhere.com");
                System.out.println(a1);
                a1.setEmail("ahteck@somewhere.com");
                System.out.println(a1);
                System.out.println("name is: " + a1.getName());
                System.out.println("email is: " + a1.getEmail());
                // Test Book class
                ent1.ejb.e3.Book b1 = new ent1.ejb.e3.Book("12345", "Java for dummies", a1, 8.8, 88);
                System.out.println(b1);
                b1.setPrice(9.9);
                b1.setQty(99);
                System.out.println(b1);
                System.out.println("isbn is: " + b1.getIsbn());
                System.out.println("name is: " + b1.getName());
                System.out.println("price is: " + b1.getPrice());
                System.out.println("qty is: " + b1.getQty());
                System.out.println("author is: " + b1.getAuthor()); // Author's toString()
                System.out.println("author's name: " + b1.getAuthorName());
                System.out.println("author's name: " + b1.getAuthor().getName());
                System.out.println("author's email: " + b1.getAuthor().getEmail());

    }
     static public void ent1_ejb_e4(){
        // Test Customer class
        Customer c1 = new Customer(88, "Tan Ah Teck", 10);
        System.out.println(c1); // Customer's toString()
        c1.setDiscount(8);
        System.out.println(c1);
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("discount is: " + c1.getDiscount());
// Test Invoice class
        Invoice inv1 = new Invoice(101, c1, 888.8);
        System.out.println(inv1);
        inv1.setAmount(999.9);
        System.out.println(inv1);
        System.out.println("id is: " + inv1.getId());
        System.out.println("customer is: " + inv1.getCustomer()); // Customer's toString()
        System.out.println("amount is: " + inv1.getAmount());
        System.out.println("customer's id is: " + inv1.getCustomerId());
        System.out.println("customer's name is: " + inv1.getCustomerName());
        System.out.println("customer's discount is: " + inv1.getCustomerDiscount());
        System.out.printf("amount after discount is: %.2f%n", inv1.getAmountAfterDiscount());
    }
    static public void ent1_ejb_e5(){
        ent1.ejb.e5.Customer cus1 = new ent1.ejb.e5.Customer(88,"Alfon",'f');
        System.out.println(cus1);
        cus1.setGender('m');
        System.out.println(cus1.getGender());
        System.out.println(cus1.getId());
        System.out.println(cus1.getName());
        ent1.ejb.e5.Account account1 = new ent1.ejb.e5.Account(888,cus1,600);
        System.out.println(account1);
        System.out.println("id is: " + account1.getId());
        System.out.println(("money: "+account1.getBalance()));
        account1.setBalance(99.9);
        account1.withdraw(99.9);
        System.out.println(("money: "+account1.getBalance()));
        account1.deposit(100.0);
        System.out.println(("money: "+account1.getBalance()));
        System.out.println(account1);
    }
    static public void ent1_ejb_e6(){
        MyPoint p1 = new MyPoint(); // Test constructor
        System.out.println(p1); // Test toString()
        p1.setX(8); // Test setters
        p1.setY(6);
        System.out.println("x is: " + p1.getX()); // Test getters
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 0); // Test setXY()
        System.out.println(p1.getXY()[0]); // Test getXY()
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);
        MyPoint p2 = new MyPoint(0, 4); // Test another constructor
        System.out.println(p2);
// Testing the overloaded methods distance()
        System.out.println(p1.distance(p2)); // which version? V2
        System.out.println(p2.distance(p1)); // which version?  V2
        System.out.println(p1.distance(5, 6)); // which version? V1
        System.out.println(p1.distance()); // which version? V3
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < 10; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }

        System.out.println("Matriz de distancias:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%.2f\t", points[i].distance(points[j]));
            }
            System.out.println();
        }

    }
    static public void ent1_ejb_e8(){
        // Crear un círculo con el constructor por defecto
        MyCircle circle1 = new MyCircle();
        System.out.println(circle1.toString());  // Esperado: "MyCircle[radius=1, center=(0,0)]"

        // Crear un círculo con valores específicos
        MyCircle circle2 = new MyCircle(5, 5, 3);
        System.out.println(circle2.toString());  // Esperado: "MyCircle[radius=3, center=(5,5)]"

        // Probar métodos getter
        System.out.println("Radio: " + circle2.getRadius());  // Esperado: 3
        System.out.println("Centro X: " + circle2.getCenterX());  // Esperado: 5
        System.out.println("Centro Y: " + circle2.getCenterY());  // Esperado: 5

        // Probar métodos setter
        circle2.setRadius(10);
        circle2.setCenter(new MyPoint(2, 2));
        System.out.println(circle2.toString());  // Esperado: "MyCircle[radius=10, center=(2,2)]"

        // Probar getCenterXY()
        int[] centerXY = circle2.getCenterXY();
        System.out.println("CentroXY: (" + centerXY[0] + "," + centerXY[1] + ")");  // Esperado: (2,2)

        // Probar métodos de cálculo
        System.out.println("Área: " + circle2.getArea());  // Esperado: 314.159265...
        System.out.println("Circunferencia: " + circle2.getCircumference());  // Esperado: 62.831853...

        // Probar distancia entre círculos
        System.out.println("Distancia entre circle1 y circle2: " + circle1.distance(circle2));
        // Esperado: 2.828427... (distancia entre (0,0) y (2,2))
    }

}

