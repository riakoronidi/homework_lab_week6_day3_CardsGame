import sun.rmi.rmic.iiop.ValueType;

public class Card {

    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }


    public int getValueFromEnum(){
        int cardValue = Value.ACE.getValue();
        return this.value.getValue();
    }


}
