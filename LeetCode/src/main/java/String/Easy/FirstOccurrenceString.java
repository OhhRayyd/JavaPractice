package String.Easy;

public class FirstOccurrenceString {

    public static void main(String[] args) {
        String haystack = "Applerock";
        String needle = "lero";
        System.out.println(strStr(haystack, needle));
    }


    public static int strStr(String haystack, String needle){

        if(!haystack.contains(needle)){
            return -1;
        } else {
            return haystack.indexOf(needle);
        }
    }
}
