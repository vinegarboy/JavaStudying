package ex5;

import java.util.*;

public class Deck {
    public ArrayList<Card> cards = new ArrayList<Card>();
    Deck(){
        for (int i = 1; i<14;i++){
            for(int d = 0; d<4;d++){
                cards.add(new Card(d,i));
            }
        }
    }

    void show(){
        for(Card card:cards){
            System.out.println(card.toString());
        }
    }
    public static void main(String[] args) {
        Deck d = new Deck();
        d.show();
    }
}
