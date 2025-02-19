package ent1.ejb.e9;

public class MyPoint {

    // Zona de atributos
    private double x;
    private double y;

    // Zona de constructores
    // Constructor por defecto (0,0)
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor con coordenadas específicas
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Zona de métodos: Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double[] getXY() {
        return new double[]{x, y};
    }

    // Zona de métodos: Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Zona de métodos: Otros
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    // Método para calcular la distancia hasta un punto dado por coordenadas
    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    // Método para calcular la distancia hasta otra instancia de MyPoint
    public double distance(MyPoint another) {
        return distance(another.getX(), another.getY());
    }

    // Método para calcular la distancia al origen (0,0)
    public double distance() {
        return distance(0, 0);
    }
}



