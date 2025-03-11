package String.Easy;

import java.util.ArrayList;
import java.util.List;

public class ReverseVowels {

    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {

        char[] characterArray = s.toCharArray();
        char[] reversedArray = new char[s.length()];
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();

        List<Integer> position =  new ArrayList<>();
        int pointer = 0;

        for (int i = 0; i <= characterArray.length - 1; i++) {
            char c = characterArray[i];
            switch(c){
                case 'a':
                    vowels.append(c);
                    break;
                case 'e':
                    vowels.append(c);
                    break;
                case 'i':
                    vowels.append(c);
                    break;
                case 'o':
                    vowels.append(c);
                    break;
                case 'u':
                    vowels.append(c);
                    break;
                case 'A':
                    vowels.append(c);
                    break;
                case 'E':
                    vowels.append(c);
                    break;
                case 'I':
                    vowels.append(c);
                    break;
                case 'O':
                    vowels.append(c);
                    break;
                case 'U':
                    vowels.append(c);
                    break;
                default:
                    position.add(i);
                    consonants.append(c);
                    break;
            }
        }
        vowels.reverse();
        for(int i = 0; i < position.size(); i++){
            reversedArray[position.get(i)] = consonants.charAt(i);
        }
        for(int i = 0; i <= reversedArray.length - 1; i++){
            if(reversedArray[i] == '\u0000'){
                reversedArray[i] = vowels.charAt(pointer);
                pointer++;
            }
        }
        return String.valueOf(reversedArray);
    }


//    Given a string s, reverse only all the vowels in the string and return it.
//    The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
//
//    Example 1:
//
//    Input: s = "IceCreAm"
//
//    Output: "AceCreIm"
//
//    Explanation:
//
//    The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
//
//    Example 2:
//
//    Input: s = "leetcode"
//
//    Output: "leotcede"
}
