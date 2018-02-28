import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Hand> playerHand;

    public Player(String name) {
        this.name = name;
        this.playerHand = new ArrayList<Hand>();
    }

    public int checkPlayerHand(){
        return this.playerHand.size();
    }

    public void addHandtoPlayer(Hand hand){
        playerHand.add(hand);
    }
}
