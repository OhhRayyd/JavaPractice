import hangman.Hangman;
import players.HumanPlayer;
import players.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {
    private Scanner scn = new Scanner(System.in);
    //Console console  = System.console();                          // This line was going to be used in order to hide the input of a user but, it didn't fully work for me in the console
    private Hangman game;
    Player playerOne = getPlayerName(1);
    Player playerTwo = getPlayerName(2);

    public void run() {
        do {
            System.out.println("\n\n\nWelcome to HangMan");
            System.out.println("==================");

            game = new Hangman(playerOne, playerTwo);
            System.out.printf("\n(Randomizing who goes first)\n%s gets to choose the first secret word\n\n", game.getHangingPlayer().getName());
            play();
        } while (playAgain());
    }

    private void play() {
        //char[] playerWordChar = console.readPassword("Please enter your secret wordToDiscover: ");
        //String secretWord = new String(playerWordChar);

        System.out.println("Please enter your secret word: ");
        String secretWord = scn.nextLine().trim().toLowerCase();
        System.out.println("How many lives would you like to play with, Please enter a number 1-10: ");
        int lives = Integer.parseInt(scn.nextLine().trim());


        char[] wordToDiscover = new char[secretWord.length()];
        System.out.println("\n\n\n\n\n\n\n\n\n");
        initialWordStatus(secretWord, lives);
        char[] incorrectUsedLetters = new char[lives];
        int counter = 0;


        while (lives > 0 && counter < secretWord.length()) {
            for (int i = 0; i < incorrectUsedLetters.length - 1; ) {
                System.out.printf("\n\n\n%s, try to guess %s's secret word, guess a letter...then press enter.\n", game.getGuessingPlayer().getName(), game.getHangingPlayer().getName());
                String guess = scn.nextLine();
                char[] letter = guess.toCharArray();

                if (secretWord.contains(guess)) {

                    List<Integer> indexes = new ArrayList<>();
                    for (int j = 0; j < secretWord.length(); j++) {
                        if (secretWord.charAt(j) == letter[0]) {
                            indexes.add(j);  // Add the index to the list if the character matches
                            wordToDiscover[j] = letter[0];
                            counter++;
                        }
                    }

                    System.out.printf("\nNICE JOB!!! \"%s\" is apart of %s's secret word in %s spot(s), remaining guesses left: %d\n", guess, game.getHangingPlayer().getName(), indexes.size(), lives);
                    System.out.print("SECRET WORD: ");

                    for (char x : wordToDiscover) {
                        if (x == '\u0000') {
                            System.out.print(" _ ");
                        } else {
                            System.out.print(x + " ");
                        }
                    }
                    if (counter == secretWord.length()) {
                        System.out.println("\nCONGRATULATION YOU HAVE SURVIVED!!!! Run, walk, crawl, while you still can...");
                        break;
                    }
                } else {
                    lives--;
                    incorrectUsedLetters[i] = letter[0];
                    i++;

                    System.out.printf("\nYour guess: \"%s\" is not apart of %s's secret word, remaining guesses left: %d\n", guess, game.getHangingPlayer().getName(), lives);
                    System.out.print("Here's a list of letters you have incorrectly used: ");
                    for (char x : incorrectUsedLetters) {
                        if (x == '\u0000') {
                            System.out.print(" _ ");
                        } else {
                            System.out.print(x + " ");
                        }
                    }
                    System.out.print("\nSECRET WORD: ");
                    for (char x : wordToDiscover) {
                        if (x == '\u0000') {
                            System.out.print(" _ ");
                        } else {
                            System.out.print(x + " ");
                        }
                    }
                }
                // end the game immediately after a player incorrectly uses all of their guesses check the while loop
            }
        }
        System.out.println("\n\nGAME OVER");
    }

    private void initialWordStatus(String playerWord, int lives) {
        System.out.printf("%s has chosen a word with %d letters... you have %s lives to guess before you lose... good luck.\n", game.getHangingPlayer().getName(), playerWord.length(), lives);
        for (int i = 0; i < playerWord.length(); i++) {
            System.out.print("_ ");
        }
    }

    private Player getPlayerName(int playerNumber) {
        System.out.println("Player " + playerNumber + " Please enter your name: ");
        String userInput = scn.nextLine();
        return new HumanPlayer(userInput.trim());
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
