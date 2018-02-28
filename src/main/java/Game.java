import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private ArrayList<Deck> deck;

    public Game() {
        this.players = new ArrayList<Player>();
        this.deck = new ArrayList<Deck>();
    }

    public int NumberOfPlayers(){
        return this.players.size();
    }

    public void addPlayer(Player player){
        players.add(player);
    }


}
