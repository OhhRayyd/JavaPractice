package String;

public class ReverseString {

    public static void main(String[]  args){
        char[] s = {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
        System.out.println(s);
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        int pointer = s.length - 1;
        char previousChar;

        for(int i = 0; i <= ((s.length - 1) / 2); i++){
            previousChar = s[i];
            s[i] = s[pointer];
            s[pointer] = previousChar;
            pointer--;
        }
        System.out.println(s);
    }
}

