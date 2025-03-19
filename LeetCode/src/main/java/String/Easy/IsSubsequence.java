package String.Easy;

public class IsSubsequence {
    public static void main(String[] args){
        String s = "adc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }

    public static boolean isSubsequence(String s, String t){
        boolean isSub = true;
        int tPointer = 0;
        int sPointer = 0;

        outerLoop:
        while(sPointer <= s.length() - 1) {
            char currentSChar = s.charAt(sPointer);

            while (tPointer <= t.length() - 1) {
                char currentTChar = t.charAt(tPointer);
                if(currentTChar == currentSChar){
                    sPointer++;
                    tPointer++;
                    continue outerLoop;
                }
                tPointer++;
            }
            sPointer++;
            if(sPointer != s.length() + 1){
                return isSub = false;
            }
        }
        return isSub;
    }
}
