package ent1.ejb.e7;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }
    public MyPoint getBegin() {
        return begin;
    }
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }
    public MyPoint getEnd() {
        return end;
    }
    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public void setBeginX(int x) {
        begin.setX(x);
    }
    public void setBeginY(int y) {
        begin.setY(y);
    }
    public void setEndX(int x) {
        end.setX(x);
    }
    public void setEndY(int y) {
        end.setY(y);
    }
    public int getBeginX() {
        return begin.getX();
    }
    public int getBeginY() {
        return begin.getY();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }
    public int[] getBeginXY(){
        return new int[]{begin.getX(), begin.getY()};
    }
    public int[] getEndXY(){
        return new int[]{end.getX(), end.getY()};
    }
    public void setBeginXY(int x, int y) {
        setBeginX(x);
        setBeginY(y);
    }
    public void setEndXY(int x, int y) {
        setEndX(x);
        setEndY(y);
    }
    public double getLength(){
       return end.distance(begin);

    }
    public double getGradient(){
        return Math.atan2(end.getY()-begin.getY(), end.getX()-begin.getX());
    }
    @Override
    public String toString() {
        return "MyLine [begin=" + begin + ", end=" + end + "]";
    }
}
