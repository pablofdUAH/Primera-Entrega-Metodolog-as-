import ent1.eja.e1.Circle;
import ent1.eja.e2.Rectangle;

public class Main {
    public static void main(String[] args) {
        ent1_eja_e2();
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


}

