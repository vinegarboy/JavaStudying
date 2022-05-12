package ex4;

public class Card {
    private int mark;
    private int number;

    public static final int SPADE = 0;
    public static final int HEART = 1;
    public static final int CLUB = 2;
    public static final int DIAMOND = 3;

    public static final int BLACK = 0;
    public static final int RED = 1;

    public Card(int m, int num) {
        mark = m;
        number = num;
    }
    public int getMark() {
        return mark;
    }
    public int getNumber() {
        return number;
    }

    public int color(){
        if(mark == HEART ||mark == DIAMOND){
            return RED;
        }else{
            return BLACK;
        }
    }

    public String toString() {
        String ms="";
        switch (mark){
            case SPADE:
                ms = "S";
                break;

            case HEART:
                ms = "H";
                break;

            case CLUB:
                ms = "C";
                break;

            case DIAMOND:
                ms = "D";
                break;
        }
        switch (number){
            case 1:
                return "a Card("+ms+", A)";
            case 11:
                return "a Card("+ms+", J)";
            case 12:
                return "a Card("+ms+", Q)";
            case 13:
                return "a Card("+ms+", K)";
            default:
                return "a Card("+ms+", "+number+")";
        }
    }

    public boolean isEqualMark(Card aCard){
        return aCard.mark == this.mark;
    }

    public boolean isLargerThan(Card aCard){
        int num2 = aCard.number;
        if((number==1&&num2 == 13)||(number==13&&num2 == 1))
            return number < num2;
        else{
            return number > num2;
        }
    }

    public static void main(String[] args) {
        Card card1, card2, card3;
        card1 = new Card(Card.SPADE, 1);
        card2 = new Card(Card.DIAMOND, 2);
        card3 = new Card(Card.SPADE, 13);

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
        System.out.println(card1.isEqualMark(card2));
        System.out.println(card1.isEqualMark(card3));
        System.out.println(card1.isLargerThan(card2));
        System.out.println(card1.isLargerThan(card3));
    }


}