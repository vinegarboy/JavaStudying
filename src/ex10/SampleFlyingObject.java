package ex10;

public class SampleFlyingObject {
    public static void main(String[] args) {
        FlyingObject aPlane, aBird;

        aPlane = new Boeing787();
        aBird = new Swallow();

        aPlane.fly();
        aBird.fly();
        //aBird.pick();
    }
}
