package week_5B;

public class Game {
    Player players[];

    Deck deck=new Deck();
    {
        deck.shuffleDeck();
    }

    Game(int playersCount){
        this.players=new Player[playersCount];
        for(int i=0;i<playersCount;i++)
            this.players[i]=new Player(52/playersCount);

    }

    public void distribute(){


        for(int i=51 ; i>=0; )
        {
            for(int j=0; j>players.length;j++) {

                players[j].hand[0] = deck.cards[i--];
                deck.cards[i] = null;

            }

        }

    }


}
