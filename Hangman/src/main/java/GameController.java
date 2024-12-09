import hangman.GuessingWord;
import hangman.Hangman;
import players.HumanPlayer;
import players.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class GameController {
    private Scanner scn = new Scanner(System.in);
    private Hangman game;
    Player playerOne = getPlayerName(1);
    Player playerTwo = getPlayerName(2);

    public void run() {
        do {
            System.out.println("Welcome to HangMan");
            System.out.println("==================");

            game = new Hangman( playerOne, playerTwo );
            System.out.printf("\n(Randomizing who goes first)\n%s gets to choose the first guessing word\n\n", game.getHangingPlayer().getName());
            play();
        } while (playAgain());
    }

    private void play() {
        System.out.println("What is your word? Enter your word:");
        String playerWord = scn.nextLine();
        int lives = 6;
        while (lives > 0) {
            printGuessingWord(playerWord);
            System.out.printf("\n%s make your guess\n", game.getGuessingPlayer().getName());
            String guess = scn.nextLine();
            if(playerWord.contains(guess)){
                ArrayList<String> listOfLetters = lettersUsed(guess);
                for (String i : listOfLetters ) {
                    System.out.print(i + " ");
                }
            } else {
                lives--;
                ArrayList<String> listOfLetters = lettersUsed(guess);
                for (String i : listOfLetters ) {
                    System.out.print(i + " ");
                }
            }
            //check to see if guess is in the word if it is, don't get rid of a life. Else decrement lives and record letter.
            // Show the user how many Lives they have left.
        }
        System.out.println("GAME OVER");
    }

    private ArrayList lettersUsed(String letter) {
        ArrayList<String> group = new ArrayList<>();
        group.add(letter);
        return group;
    }

    private void printGuessingWord(String playerWord) {
        char[] word = new char[playerWord.length()];
        for (int i = 0; i < playerWord.length(); i++) {
            System.out.print("_");
            word[i] = playerWord.charAt(i);
        }
        System.out.println();
    }

    private Player getPlayerName(int playerNumber) {
        System.out.println("Player" + playerNumber + " Please enter your name: ");
        String userInput = scn.nextLine();
        return new HumanPlayer(userInput);
    }

    private boolean playAgain() {
        System.out.println("Would you like to play again? [Y/N]");
        boolean result = true;
        String userInput = scn.nextLine();
        if (userInput.equalsIgnoreCase("N")) {
            System.out.println("Thanks for playing goodbye");
            return false;
        }
        return result;
    }

}
