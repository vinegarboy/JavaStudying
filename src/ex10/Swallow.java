package ex10;

public class Swallow extends Bird implements FlyingObject{
    @Override
    public void fly() {
        System.out.println("Swallowが飛びます。");
    }
}
