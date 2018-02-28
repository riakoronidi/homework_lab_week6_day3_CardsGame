import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<Card>();
    }

    public void addCardToHand(Card card){
        hand.add(card);
    }

    public int getHandCount(){
        return this.hand.size();
    }

    public int total(){
        int total = 0;
        total += this.hand.getValue();
        return total;
    }

}
