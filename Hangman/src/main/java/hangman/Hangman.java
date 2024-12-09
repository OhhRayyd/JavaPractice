package hangman;

import players.Player;

public class Hangman {

    private final Player playerOne;
    private final Player playerTwo;
    private Player hangingPlayer;
    private Player guessingPlayer;

    private boolean over;

    public Hangman(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;

        if (Math.random() < 0.5) {
            hangingPlayer = playerOne;
            guessingPlayer = playerTwo;
        } else {
            hangingPlayer = playerTwo;
            guessingPlayer = playerOne;
        }
    }

    public Player getPlayerOne(){return playerOne; }
    public Player getPlayerTwo(){return playerTwo; }

    public Player getHangingPlayer() {
        return hangingPlayer;
    }
    public Player getGuessingPlayer(){
        return guessingPlayer;
    }

    public boolean isOver() {
        return over;
    }
}
