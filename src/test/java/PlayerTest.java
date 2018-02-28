import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Hand hand;

    @Before
    public void before(){
        this.player = new Player("player1");
        hand = new Hand();
    }

    @Test
    public void addHandToPlayer(){
        player.addHandtoPlayer(hand);
        assertEquals(1,player.checkPlayerHand());
    }
}
