package String;

public class GreatestCommonDivisor {
    public static void main(String[] args){
        String str1 = "ABABAB";
        String str2 = "ABAB";
        System.out.println(gcdOfStrings(str1, str2));
    }


    public static String gcdOfStrings(String str1, String str2) {

        int stringLength1 = str1.length();
        int stringLength2 = str2.length();
        int minLength = Math.min(stringLength1, stringLength2);
        int maxLength = Math.max(stringLength1, stringLength2);

        int gcdOfStrings = gcd(48, 420);

        String potentialString = str1.substring(0 , gcdOfStrings);

        if (str1.replace(potentialString, "").isEmpty() && str2.replace(potentialString, "").isEmpty()) {
            return potentialString; // Return the GCD string
        }
        return "";
    }

    public static int gcd(int min, int max){

        while(min != 0) {
            int temp = min;
            min = max % min;
            max = temp;
        }
        return max;
    }

//    For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
//    Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
//
//    Example 1:
//
//    Input: str1 = "ABCABC", str2 = "ABC"
//    Output: "ABC"
//    Example 2:
//
//    Input: str1 = "ABABAB", str2 = "ABAB"
//    Output: "AB"
//    Example 3:
//
//    Input: str1 = "LEET", str2 = "CODE"
//    Output: ""
}
