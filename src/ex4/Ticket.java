package ex4;

public class Ticket {
    private static int count;
    private int number;

    Ticket(){
        count += 1;
        number = count;
    }
    public int getNumber(){
        return number;
    }

    public String toString() {
        return "Ticket(" + getNumber() + ")";
    }
}
