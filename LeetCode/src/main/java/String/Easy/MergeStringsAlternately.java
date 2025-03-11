package String.Easy;

public class MergeStringsAlternately {

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "xyz12";
        System.out.println(mergeAlternately(word1, word2));
    }

    private static String mergeAlternately(String word1, String word2) {

        int word1Length = word1.length();
        int word2Length = word2.length();
        int maxLength = Math.max(word1Length, word2Length);
        StringBuilder word3 = new StringBuilder();
        int pointer1 = 0;
        int pointer2 = 0;

        char[] word1arr = word1.toCharArray();
        char[] word2arr = word2.toCharArray();

        for (int i = 0; i <= maxLength - 1; i++) {
            if (pointer1 < word1Length) {
                word3.append(word1arr[pointer1]);
                pointer1++;
            }
            if (pointer2 < word2Length) {
                word3.append(word2arr[pointer2]);
                pointer2++;
            }
        }

        return word3.toString();
//        int maxLength = Math.max(word1.length(), word2.length());
//        List<String> joinedArrayList = new ArrayList<>();
//
//        for (int i = 0; i < maxLength; i++) {
//            if (i < word1.length()) {
//                joinedArrayList.add(String.valueOf(word1.charAt(i)));
//            }
//            if (i < word2.length()) {
//                joinedArrayList.add(String.valueOf(word2.charAt(i)));
//            }
//        }
//        return String.join("", joinedArrayList);
    }


}
