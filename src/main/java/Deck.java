import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
    }


    public void populate(){
        for(Suit suit : Suit.values()){
            for(Value value : Value.values()){
                this.cards.add(new Card(suit, value));
            }
        }

    }

    public int getSize(){
        return this.cards.size();
    }

    public Card deal(){
        Collections.shuffle(cards);
        return this.cards.get(0);
    }

    public ArrayList<Card> getCard() {
        return new ArrayList<>(cards);
    }



}
