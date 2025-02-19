package ent1.ejb.e9;

import ent1.ejb.e6.MyPoint;

public class MyTriangle {

    // Zona de atributos
    private MyPoint v1 = new MyPoint();
    private MyPoint v2 = new MyPoint();
    private MyPoint v3 = new MyPoint();

    // Zona de constructores
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
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
        double distance1 = v1.distance(v2);
        double distance2 = v1.distance(v3);
        double distance3 = v2.distance(v3);

        if (distance1 == distance2 && distance1 == distance3) {
            return "Equilateral";
        } else if (distance1 == distance2 || distance1 == distance3 || distance2 == distance3) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

}

