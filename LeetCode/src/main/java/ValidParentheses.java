import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String str = "((";
        System.out.println(isValid(str));
    }


    public static boolean isValid(String str) {
        if (str.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stackOfCharacters = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stackOfCharacters.push(ch);
            } else {
                if (stackOfCharacters.isEmpty()) {
                    return false;
                }
                char top = stackOfCharacters.pop();

                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }

        return stackOfCharacters.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

//        checkCharacterSequence(s);
//        return true;
//    }
//
//    private static void checkCharacterSequence(String s) {
//
//        char[] charArray = s.toCharArray();
//        StringBuilder isItAMatch = new StringBuilder();
//        CharSequence sequence = new StringBuilder().append(charArray);
//
//        int j = sequence.length() - 1;
//        outloop:
//        for (int i = 0; i < sequence.length(); i++) {
//            boolean conditionMet = false;
//
//            for (; j > 0; j--) {
//
//                if (i >= j) {
//                    break;
//                }
//                if (sequence.charAt(i) == '(' && sequence.charAt(j) == ')') {
//                    System.out.println("We found a match");
//                    String message = String.format("%s%s", sequence.charAt(i), sequence.charAt(j));
//                    System.out.println(message);
//
//                    System.out.println(sequence.subSequence(i + 1, j));
//                    j--;
//                    continue outloop;
////                    conditionMet = true;
//                }
//                if (sequence.charAt(i) == '{' && sequence.charAt(j) == '}') {
//                    System.out.println("We found a match");
//                    String message = String.format("%s%s", sequence.charAt(i), sequence.charAt(j));
//                    System.out.println(message);
//
//                    System.out.println(sequence.subSequence(i + 1, j));
//                    j--;
//                    continue outloop;
////                    conditionMet = true;
//                }
//                if (sequence.charAt(i) == '[' && sequence.charAt(j) == ']') {
//                    System.out.println("We found a match");
//                    String message = String.format("%s%s", sequence.charAt(i), sequence.charAt(j));
//                    System.out.println(message);
//
//                    System.out.println(sequence.subSequence(i + 1, j));
//                    j--;
//                    continue outloop;
////                    conditionMet = true;
//                }
//
//            }
//        }
//
//        switch (isItAMatch.toString()) {
//            case "()":
//                System.out.println("Parenthesis match");
//                break;
//            case "{}":
//                System.out.println("curly match");
//                break;
//            case "[]":
//                System.out.println("Bracket match");
//                break;
//        }
//    }


//    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//    An input string is valid if:
//
//    Open brackets must be closed by the same type of brackets.
//    Open brackets must be closed in the correct order.
//    Every close bracket has a corresponding open bracket of the same type.

}
