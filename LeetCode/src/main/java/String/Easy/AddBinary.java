package String.Easy;

public class AddBinary {

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));

    }

    public static String addBinary(String a, String b) {
        int firstPointer = a.length() - 1;
        int secondPointer = b.length() - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while (firstPointer >= 0 || secondPointer >= 0 || carry > 0) {
            int bit1 = firstPointer >= 0 ? a.charAt(firstPointer) - '0' : 0;
            int bit2 = secondPointer >= 0 ? b.charAt(secondPointer) - '0' : 0;

            int sum = bit1 + bit2 + carry;
            carry = sum / 2;
            sb.append(sum % 2);

            firstPointer--;
            secondPointer--;
        }

        return sb.reverse().toString();
    }
}
