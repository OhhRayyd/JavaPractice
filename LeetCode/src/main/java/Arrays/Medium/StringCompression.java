package Arrays.Medium;

public class StringCompression {

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'a', 'a', 'a'};
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {
        String s = "";
        int n = chars.length;
        int firstPointer = 0;
        int secondPointer = 0;
        int counter = 0;

        for (; secondPointer < n; secondPointer++) {
            CharSequence currentChar = String.valueOf(chars[secondPointer]);
            if(secondPointer == 0 ){
                s = s.concat(String.valueOf(chars[0]));
                counter++;
                continue;
            }
            if (currentChar.charAt(0) != chars[secondPointer - 1]) {
                if (counter != 1) {
                    s = s.concat(String.valueOf(counter));
                }
                s = s.concat(String.valueOf(chars[secondPointer]));
                counter = 1;
            } else {
                counter++;
            }
        }
        if (counter != 1) {
            s = s.concat(String.valueOf(counter));
        }
        for (char c : s.toCharArray()) {
            chars[firstPointer] = c;
            firstPointer++;
        }

        return s.length();
    }
}
