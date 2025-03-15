package String.Medium;

import java.util.ArrayList;
import java.util.List;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "the    sky  is   blue   ";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {

        String modifiedString = s.trim();
        int endPointer = modifiedString.length() - 1;
        int startingPointer = 0;
        int numberOfSpaces = 0;
        List<String> listOfWords = new ArrayList<>();
        char[] arrOfModifiedString = modifiedString.toCharArray();
        StringBuilder sb = new StringBuilder();

        while (endPointer >= 0) {
            char c = arrOfModifiedString[endPointer];
            if (c == ' ') {
                numberOfSpaces++;
            }
            if (c != ' ' || endPointer - 1 == -1) {
                sb.append(c);
                if (endPointer == 0) {
                    listOfWords.add(startingPointer, sb.reverse().toString());
                }
                endPointer--;
                numberOfSpaces = 0;
            } else {
                if (numberOfSpaces == 1) {
                    listOfWords.add(startingPointer, sb.reverse().toString());
                    startingPointer++;
                    endPointer--;
                    sb = new StringBuilder();
                } else {
                    endPointer--;
                }
            }
        }
        return String.join(" ", listOfWords);
    }
}
