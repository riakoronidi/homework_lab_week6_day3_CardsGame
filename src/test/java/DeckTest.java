import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeckTest {

    Deck deck;

    @Before
    public void before(){
        this.deck = new Deck();
    }

    @Test
    public void canPopulateTheDeck(){
        deck.populate();
        assertEquals(52, deck.getSize());
    }

    @Test
    public void canReturnCard(){
        deck.populate();
        ArrayList results = deck.getCard();
        Card randomAnswer = deck.deal();
        assertTrue(results.contains(randomAnswer));
    }


}
