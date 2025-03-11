package String.Easy;

public class ValidPalindrome {
/*
    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    Given a string s, return true if it is a palindrome, or false otherwise.
            Example 1:

    Input: s = "A man, a plan, a canal: Panama"
    Output: true
    Explanation: "amanaplanacanalpanama" is a palindrome.
            Example 2:

    Input: s = "race a car"
    Output: false
    Explanation: "raceacar" is not a palindrome.
            Example 3:

    Input: s = " "
    Output: true
    Explanation: s is an empty string "" after removing non-alphanumeric characters.
    Since an empty string reads the same forward and backward, it is a palindrome.
*/


    public static void main(String[] args) {
        String s = "amanaplanacanalpanama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        char[] characterArray = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        int firstPointer = 0;
        int secondPointer = characterArray.length - 1;

        while((firstPointer < secondPointer)) {
            if((characterArray[firstPointer] == characterArray[secondPointer])){
                firstPointer++;
                secondPointer--;
            } else {
                return false;
            }
        }
        return true;
    }
}
