package String.Easy;

public class LengthOfLastWord {

    public static void main(String[] args) {
        String s = "a ";
        System.out.print(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        //below is my brute force approach where I try to find the character of the string and try to match it.

//        char[] charArray = s.toCharArray();
//        int numberOfLetters = 0;
//        String sb = "";
//        if (!s.contains(" ")) {
//            return s.length();
//        } else if (s.contentEquals(" ")) {
//            return 0;
//        }
//
//        for (int i = charArray.length - 1; i >= 0; i--) {
//            if (charArray[i] == ' ' && sb.isEmpty()) {
//                continue;
//            } else {
//                sb = sb.concat(String.valueOf(charArray[i]));
//                numberOfLetters++;
//            }
//            if (sb.contains(" ") && i == 0) {
//                return numberOfLetters - 1;
//            } else if (sb.contains(" ")) {
//                break;
//            }
//        }
//        if(!sb.contains(" ")){
//            return numberOfLetters;
//        }
//
//        return sb.length() - 1;

        int endPointer = s.length() - 1;
        for (; endPointer >= 0 && s.charAt(endPointer) == ' ';) {
            endPointer--;
        }

        int startPointer = endPointer;
        for (; startPointer >= 0 && s.charAt(startPointer) != ' ';){
            startPointer--;
        }

        return endPointer - startPointer;
    }
}

