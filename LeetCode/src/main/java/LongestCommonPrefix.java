import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] listOfStrings = {"flower","flow","flight"};
        longestCommonPF(listOfStrings);
    }

//    public static String longestCommonPF(String[] listOfStrings) {
//        List<String> stringObjects = new ArrayList<>(Arrays.asList(listOfStrings));
//        return iteration(stringObjects);
//    }
//
//    public static String iteration(List<String> stringObjects) {
//
//        StringBuilder first = new StringBuilder();
//        StringBuilder second = new StringBuilder();
//        StringBuilder third = new StringBuilder();
//        int maxLength = 0;
//
//        List<char[]> charArrayList = new ArrayList<>();
//        for (String s : stringObjects) {
//            char[] charArray = s.toCharArray();
//            charArrayList.add(s.toCharArray());
//            maxLength = Math.max(maxLength, charArray.length);
//        }
//
//        boolean is123equal = true;
//
//
//        for (int i = 0; i < maxLength; i++) { // Loops through the word up until the max length of a word is reached
//            int counter = 0;
//            if (is123equal) {
//                for (int j = 0; j < charArrayList.size(); j++) { // Loops through the list [ {...},{...},{...} ]
//
//                    if (i < charArrayList.get(j).length) {
//
//                        if (charArrayList.get(j) == charArrayList.get(counter)) {
//                            first.append(charArrayList.get(counter)[i]);
//                        }
//                        if (charArrayList.get(j) == charArrayList.get(counter)) {
//                            second.append(charArrayList.get(counter)[i]);
//                        }
//                        if (charArrayList.get(j) == charArrayList.get(counter)) {
//                            third.append(charArrayList.get(counter)[i]);
//                        }
//                        is123equal = first.toString().contentEquals(second) && second.toString().contentEquals(third);
//                    }
//                }
//            } else {
//                first.deleteCharAt(first.length() - 1);
//                second.deleteCharAt(second.length() - 1);
//                third.deleteCharAt(third.length() - 1);
//                i = maxLength;
//            }
//        }
//        return first.toString();
//    }




    public static String longestCommonPF(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        return findLongestCommonPrefix(strs);
    }

    private static String findLongestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder(strs[0]);

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix.toString()) != 0) {
                // Remove last character if it doesn't match
                prefix.deleteCharAt(prefix.length() - 1);
                if (prefix.length() == 0) return "";
            }
        }
        return prefix.toString();
    }


}
        /*Write a function to find the longest common prefix string amongst an array of strings.
                If there is no common prefix, return an empty string "".

        Example 1:

        Input: strs = ["flower","flow","flight"]
        Output: "fl"
        Example 2:

        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.

        Constraints:

        1 <= strs.length <= 200
        0 <= strs[i].length <= 200
        strs[i] consists of only lowercase English letters if it is non-empty.*/

