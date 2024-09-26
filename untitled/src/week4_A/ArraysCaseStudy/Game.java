package week4_A.ArraysCaseStudy;

public class Game {
    Player players[];

    Game(int numOfPlayers) {
        players = new Player[numOfPlayers];
        players[0]= new Player(52/numOfPlayers);

    }

}
