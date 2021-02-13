package week08d01;

public class Point {

    private int y;
    private int x;

    public Point(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public int getY(){return y;}

    public int getX(){return x;}

    public void increaseX(){ x++;}
    public void increaseY(){ y++;}
    public void decreaseX(){ x--;}
    public void decreaseY(){ y--;}

    }


