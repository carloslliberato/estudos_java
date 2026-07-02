public class Card {
    private final String face;
    private final String suite;

    public Card(String cardFace, String cardSuit){
        this.face = cardFace;
        this.suite = cardSuit;
    }

    public String toString(){
        return this.face + " of " + this.suite;
    }
}
