package ent1.ejb.e9;


public class MyTriangle {

    // Zona de atributos
    private MyPoint v1 = new MyPoint();
    private MyPoint v2 = new MyPoint();
    private MyPoint v3 = new MyPoint();

    // Zona de constructores
    public MyTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        v1.setXY(x1, y1);
        v2.setXY(x2, y2);
        v3.setXY(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    //Zona de métodos: getters
    public MyPoint getV1() {
        return v1;
    }

    public MyPoint getV2() {
        return v2;
    }

    public MyPoint getV3() {
        return v3;
    }

    // Zona de métodos: toString
    @Override
    public String toString() {
        return "MyTriangle[v1=" + v1 + ",v2=" + v2 + ",v3=" + v3 + "]";
    }


    // Zona de métodos: Otros
    public double getPerimeter() {
        return v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
    }

    public String getType() {
        double tolerance = 1E-6;  // Definimos un margen de error pequeño
        double d1 = v1.distance(v2);
        double d2 = v1.distance(v3);
        double d3 = v2.distance(v3);

        if (Math.abs(d1 - d2) < tolerance && Math.abs(d1 - d3) < tolerance) {
            return "Equilateral";
        } else if (Math.abs(d1 - d2) < tolerance || Math.abs(d1 - d3) < tolerance || Math.abs(d2 - d3) < tolerance) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

}

