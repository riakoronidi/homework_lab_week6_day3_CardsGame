import org.junit.Before;
import org.junit.Test;
import sun.rmi.rmic.iiop.ValueType;

import static org.junit.Assert.assertEquals;

public class HandTest {

    Hand hand;
    Deck deck;
    Card card;

    @Before
    public void before(){
        this.hand = new Hand();
        deck = new Deck();
        card = new Card(Suit.CLUBS, Value.EIGHT);
    }

    @Test
    public void canAddCardToHand(){
        hand.addCardToHand(card);
        assertEquals(1, hand.getHandCount());
    }

    @Test
    public void getTotalOfCards(){
        hand.addCardToHand(card);
        assertEquals(8, hand.getTotal());
    }
}
