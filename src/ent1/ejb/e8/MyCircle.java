package ent1.ejb.e8;
import ent1.ejb.e6.MyPoint;

import java.security.PrivateKey;

public class MyCircle {
    private MyPoint center = new MyPoint();
    private int radius=1;

    public MyCircle(){}
    public MyCircle(int x,int y,int radius){
        this.center.setXY(x,y);
        this.radius=radius;
    }

    public int getRadius() {
        return radius;
    }

    public MyPoint getCenter() {
        return center;
    }


    public void setRadius(int radius) {
        if (radius<0){this.radius=0;
        } else{this.radius=radius;}
        this.radius = radius;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public int getCenterX(){
        return center.getX();
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterX(int x){
        center.setX(x);
    }
    public void setCenterY(int y){
        center.setY(y);
    }
    public int[] getCenterXY(){
        return new int[]{center.getX(),center.getY()};

    }
    public void setCenterXY(int x, int y){
        setCenterX(x);
        setCenterY(y);
    }
    @Override
    public String toString(){
        return "MyCircle[radius="+radius+",center="+center+"]";

    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    public double distance(MyCircle another){
        return center.distance(another.center);
    }

}
