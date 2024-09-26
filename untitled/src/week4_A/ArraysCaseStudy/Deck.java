package week4_A.ArraysCaseStudy;

import java.util.Random;

public class Deck {


    private Card cards[];
    private  final int MAXIMUM_LENGTH=52;
    private final String RANKS[] ={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
    private final String SUITS[] = {"Hearts","Diamonds","Clubs","Spades"};

    Deck(){
        cards=new Card[MAXIMUM_LENGTH];
        int cardIndex=0;
        for (int i=0; i<SUITS.length;i++)
            for (int j=0;j<RANKS.length;j++)
                    cards[cardIndex++]= new Card(SUITS[i],RANKS[j]);

    }


    public void displayDeck(){
        for(int i=0;i<cards.length;i++)
            System.out.println(cards[i]);

    }


    public void shuffle(){

        Card temp;
        Random random = new Random();
        for(int i=0;i<6000;i++){
            int randomIndex = random.nextInt(52);
            temp = cards[randomIndex];
            cards[randomIndex] = cards[0];
            cards[0]=temp;
        }
    }

}
