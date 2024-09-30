package week_5B;
import java.util.Random;

public class Deck {

    static final String suits[] ={"Clubs","Diamond","Hearts","Spades"};
    static final String ranks[] ={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","king"};
    public Card[] cards;

    {
        cards = new Card[52];
        // initialize cards with ranks and suits
    }

    public Deck() {
        int indexCount = 0;

        for (int i = 0; i < suits.length; i++)
            for (int j = 0; j < ranks.length; j++)
                cards[indexCount++] = new Card(ranks[j], suits[i]);


    }


    public void displayDeck(){
        for (int i = 0; i < cards.length; i++)
            System.out.println(cards[i]);

    }

    public void shuffleDeck(){
        Random rand = new Random();

        for(int i = 0; i < 6000; i++){
            int r = rand.nextInt(52);
            Card temp = cards[r];
            cards[r] = cards[0];
            cards[0] = temp;
        }

    }
}
