package ent1.ejb;

import ent1.ejb.e1.Author;
import ent1.ejb.e1.Book;
import ent1.ejb.e4.Customer;
import ent1.ejb.e4.Invoice;
import ent1.ejb.e6.MyPoint;
import ent1.ejb.e7.MyLine;
import ent1.ejb.e8.MyCircle;
import ent1.ejb.e9.MyTriangle;

public class Main {

    public static void main(String[] args) {
        ent1_ejb_e6(); // Llamamos al ejemplo de MyPoint (ent1_ejb_e6)
    }

    // Método que prueba la funcionalidad de la clase Author y Book (Ejercicio 1)
    static public void ent1_ejb_e1(){
        // Crear un autor con un nombre, email y género
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck); // Imprimir información del autor usando el método toString()

        // Crear un libro asociado a este autor
        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);
        System.out.println(dummyBook); // Imprimir información del libro usando el método toString()

        // Modificar los valores del libro con setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);

        // Imprimir los detalles del libro
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor()); // Obtener el autor del libro
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

        // Crear un libro con un autor anónimo
        Book anotherBook = new Book("more Java", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook); // Imprimir el nuevo libro
    }

    // Método para probar el manejo de arreglos de autores (Ejercicio 2)
    static public void ent1_ejb_e2(){
        // Crear un arreglo de autores
        ent1.ejb.e2.Author[] authors = new ent1.ejb.e2.Author[2];
        authors[0] = new ent1.ejb.e2.Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new ent1.ejb.e2.Author("Paul Tan", "Paul@nowhere.com", 'm');

        // Crear un libro con varios autores
        ent1.ejb.e2.Book javaDummy = new ent1.ejb.e2.Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy); // Imprimir el libro
    }

    // Método que prueba la funcionalidad de la clase Author y Book (Ejercicio 3)
    static public void ent1_ejb_e3(){
        // Crear y probar la clase Author
        ent1.ejb.e3.Author a1 = new ent1.ejb.e3.Author("Tan Ah Teck", "ahteck@nowhere.com");
        System.out.println(a1); // Imprimir el autor

        // Modificar email y mostrar el cambio
        a1.setEmail("ahteck@somewhere.com");
        System.out.println(a1);

        // Crear y probar la clase Book
        ent1.ejb.e3.Book b1 = new ent1.ejb.e3.Book("12345", "Java for dummies", a1, 8.8, 88);
        System.out.println(b1);

        // Modificar atributos del libro
        b1.setPrice(9.9);
        b1.setQty(99);
        System.out.println(b1);

        // Imprimir detalles del libro
        System.out.println("isbn is: " + b1.getIsbn());
        System.out.println("name is: " + b1.getName());
        System.out.println("price is: " + b1.getPrice());
        System.out.println("qty is: " + b1.getQty());
        System.out.println("author is: " + b1.getAuthor());
        System.out.println("author's name: " + b1.getAuthorName());
        System.out.println("author's name: " + b1.getAuthor().getName());
        System.out.println("author's email: " + b1.getAuthor().getEmail());
    }

    // Método que prueba las clases Customer e Invoice (Ejercicio 4)
    static public void ent1_ejb_e4(){
        // Crear un cliente
        Customer c1 = new Customer(88, "Tan Ah Teck", 10);
        System.out.println(c1); // Imprimir información del cliente

        // Modificar descuento del cliente y mostrar cambio
        c1.setDiscount(8);
        System.out.println(c1);
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("discount is: " + c1.getDiscount());

        // Crear una factura
        Invoice inv1 = new Invoice(101, c1, 888.8);
        System.out.println(inv1); // Imprimir factura

        // Modificar monto de la factura
        inv1.setAmount(999.9);
        System.out.println(inv1);
        System.out.println("id is: " + inv1.getId());
        System.out.println("customer is: " + inv1.getCustomer());
        System.out.println("amount is: " + inv1.getAmount());
        System.out.println("customer's id is: " + inv1.getCustomerId());
        System.out.println("customer's name is: " + inv1.getCustomerName());
        System.out.println("customer's discount is: " + inv1.getCustomerDiscount());
        System.out.printf("amount after discount is: %.2f%n", inv1.getAmountAfterDiscount());
    }

    // Método para probar la funcionalidad de Customer, Account (Ejercicio 5)
    static public void ent1_ejb_e5(){
        // Crear un cliente y cuenta
        ent1.ejb.e5.Customer cus1 = new ent1.ejb.e5.Customer(88, "Alfon", 'f');
        System.out.println(cus1);
        cus1.setGender('m');
        System.out.println(cus1.getGender());
        System.out.println(cus1.getId());
        System.out.println(cus1.getName());

        // Crear una cuenta y realizar transacciones
        ent1.ejb.e5.Account account1 = new ent1.ejb.e5.Account(888, cus1, 600);
        System.out.println(account1);

        // Operaciones de saldo
        account1.setBalance(99.9);
        account1.withdraw(99.9);
        System.out.println("money: " + account1.getBalance());
        account1.deposit(100.0);
        System.out.println("money: " + account1.getBalance());
        System.out.println(account1);
    }

    // Método para probar la clase MyPoint (Ejercicio 6)
    static public void ent1_ejb_e6(){
        MyPoint p1 = new MyPoint(); // Crear punto con el constructor por defecto
        System.out.println(p1); // Imprimir punto

        // Modificar coordenadas y probar métodos
        p1.setX(8);
        p1.setY(6);
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 0);
        System.out.println(p1.getXY()[0]);
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);

        // Crear otro punto y calcular distancia
        MyPoint p2 = new MyPoint(0, 4);
        System.out.println(p2);
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        System.out.println(p1.distance(5, 6));
        System.out.println(p1.distance());

        // Probar matriz de distancias
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
    static public void ent1_ejb_e7(){
        // Crear dos puntos MyPoint para formar una línea
        ent1.ejb.e7.MyPoint punto1 = new ent1.ejb.e7.MyPoint(2, 3);
        ent1.ejb.e7.MyPoint punto2 = new ent1.ejb.e7.MyPoint(5, 7);

        // Crear una línea usando los puntos creados
        MyLine line = new MyLine(punto1, punto2);

        // Imprimir información sobre la línea
        System.out.println("Línea creada: " + line);
        System.out.println("Coordenadas de inicio: " + line.getBegin());
        System.out.println("Coordenadas de fin: " + line.getEnd());
        System.out.println("Longitud de la línea: " + line.getLength());
        System.out.println("Gradiente de la línea (en radianes): " + line.getGradient());
    }
    // Método para probar la clase MyCircle (Ejercicio 8)
    static public void ent1_ejb_e8() {
        // Crear un círculo con el constructor por defecto
        MyCircle circle1 = new MyCircle();
        System.out.println(circle1.toString());

        // Crear un círculo con valores específicos
        MyCircle circle2 = new MyCircle(5, 5, 3);
        System.out.println(circle2.toString());

        // Probar métodos getter para obtener el radio y las coordenadas del centro
        System.out.println("Radio: " + circle2.getRadius());
        System.out.println("Centro X: " + circle2.getCenterX());
        System.out.println("Centro Y: " + circle2.getCenterY());

        // Probar métodos setter para modificar el radio y el centro del círculo
        circle2.setRadius(10);
        circle2.setCenter(new MyPoint(2, 2));
        System.out.println(circle2.toString());

        // Probar método getCenterXY() que devuelve el centro como un arreglo de dos elementos
        int[] centerXY = circle2.getCenterXY();
        System.out.println("CentroXY: (" + centerXY[0] + "," + centerXY[1] + ")");

        // Probar métodos de cálculo: área y circunferencia
        System.out.println("Área: " + circle2.getArea());
        System.out.println("Circunferencia: " + circle2.getCircumference());

        // Probar distancia entre dos círculos (circle1 y circle2)
        System.out.println("Distancia entre circle1 y circle2: " + circle1.distance(circle2));
    }

    // Método para probar la clase MyTriangle (Ejercicio 9)
    static public void ent1_ejb_e9(){
        // Crear un triángulo usando coordenadas directas
        MyTriangle triangle1 = new MyTriangle(0, 0, 3, 0, 0, 4);
        System.out.println(triangle1.toString());

        // Crear un triángulo usando objetos MyPoint
        ent1.ejb.e9.MyPoint p1 = new ent1.ejb.e9.MyPoint(1, 1);
        ent1.ejb.e9.MyPoint p2 = new ent1.ejb.e9.MyPoint(4, 1);
        ent1.ejb.e9.MyPoint p3 = new ent1.ejb.e9.MyPoint(1, 5);
        MyTriangle triangle2 = new MyTriangle(p1, p2, p3);
        System.out.println(triangle2.toString());

        // Probar método getPerimeter() que calcula el perímetro del triángulo
        System.out.println("Perímetro de triangle1: " + triangle1.getPerimeter());
        System.out.println("Perímetro de triangle2: " + triangle2.getPerimeter());

        // Probar método getType() que devuelve el tipo de triángulo (Escaleno, Equilátero, Isósceles)
        System.out.println("Tipo de triangle1: " + triangle1.getType());
        System.out.println("Tipo de triangle2: " + triangle2.getType());

        // Probar con un triángulo equilátero
        MyTriangle triangle3 = new MyTriangle(0, 0, 2, 0, 1, 2);
        System.out.println(triangle3.toString());

        // Verificar el perímetro y tipo del triángulo equilátero
        System.out.println("Perímetro de triangle3: " + triangle3.getPerimeter());
        System.out.println("Tipo de triangle3: " + triangle3.getType());
    }

    // Método para probar la clase MyLine (Ejercicio 7)


}


