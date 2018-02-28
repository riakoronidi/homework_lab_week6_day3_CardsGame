import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Player players;

    @Before
    public void before(){
        this.game = new Game();
        players = new Player("player1");
        players = new Player("player2");
    }

    @Test
    public void checkNumberOfPlayers(){
        assertEquals(0, game.NumberOfPlayers());
        game.addPlayer(players);
        game.addPlayer(players);
        assertEquals(2, game.NumberOfPlayers());
    }



}
