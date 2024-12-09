package hangman;

public class GuessingWord {
    private String word;
    private char[] guessingWord;

    public GuessingWord(char[] guessingWord) {
        this.guessingWord = guessingWord;
    }

    public String getGuessingWord(){
        return word;
    }


}
