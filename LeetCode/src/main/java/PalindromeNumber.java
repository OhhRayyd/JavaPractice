public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 121;
        System.out.println(isPalindrome(number));
    }

    public static boolean isPalindrome(int x) {

        String int_to_String = Integer.toString(x);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int zero = 0;
        for (int i = 0; i < int_to_String.length(); i++) {
            System.out.println(int_to_String.charAt(i));
            sb1.insert(i,int_to_String.charAt(i));
        }

        for(int i = int_to_String.length()-1; i >= 0; i--){
            System.out.println(int_to_String.charAt(i));
            sb2.insert(zero,int_to_String.charAt(i));
            zero++;
        }
        if(sb1.toString().equalsIgnoreCase(sb2.toString())){
            //The Case of being a palindrome
            return true;
        } else {
            //The case of not being a palidrome
            return false;
        }
    }
}

