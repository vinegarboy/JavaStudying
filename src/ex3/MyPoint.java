package ex3;

import java.lang.Math.*;

import static java.lang.Math.*;

public class MyPoint {
    private int x,y;
    MyPoint(int x , int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public double getR(){
        return hypot(x,y);
    }

    public double getTheta(){
        return toDegrees(atan2(y,x));
    }

    public double distance(MyPoint anotherPoint){
        return sqrt(((x- anotherPoint.getX())*(x-anotherPoint.getX()))+((y- anotherPoint.getY())*(y-anotherPoint.getY())));
    }

    public String toString() {
        return "a MyPoint(" + getX() + ", " + getY() + ")";
    }
}
