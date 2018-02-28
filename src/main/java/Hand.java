import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<Card>();
    }

    public void addCardToHand(Card card){
        cards.add(card);
    }

    public int getHandCount(){
        return this.cards.size();
    }

    public int getTotal(){
        int total = 0;
        for (Card card : this.cards){
            total += card.getValueFromEnum();
        }
        return total;
    }

}
