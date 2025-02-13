package ent1.ejb.e6;

public class MyPoint {
    private int x;
    private int y;

    // Constructor por defecto (0,0)
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor con coordenadas específicas
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    // Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Método toString
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    // Método para calcular la distancia hasta un punto dado por coordenadas
    public double distance(int x, int y) {
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


