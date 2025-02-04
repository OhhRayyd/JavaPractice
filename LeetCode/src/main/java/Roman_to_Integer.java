public class Roman_to_Integer {
    public static void main(String[] arg) {
        String s = "MCMXCVII";
        int result = romanToInteger(s);
        System.out.println(result);
    }

    public static Integer romanToInteger(String s) {

        char[] romanArray = s.toCharArray();
        int sum = 0;
        int i;

        for (i = 0; i < romanArray.length - 1; i++) {

            switch (romanArray[i]) {
                case 'I':
                    if (romanArray[i + 1] == 'V') {
                        sum += 4;
                        i++;
                    } else if (romanArray[i + 1] == 'X') {
                        sum += 9;
                        i++;
                    } else {
                        sum += 1;
                    }
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    if (romanArray[i + 1] == 'L') {
                        sum += 40;
                        i++;
                    } else if (romanArray[i + 1] == 'C') {
                        sum += 90;
                        i++;
                    } else {
                        sum += 10;
                    }
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    if (romanArray[i + 1] == 'D') {
                        sum += 400;
                        i++;
                    } else if (romanArray[i + 1] == 'M') {
                        sum += 900;
                        i++;
                    } else {
                        sum += 100;
                    }
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
            }
        }
        if (i == romanArray.length - 1) {
            String lastLetter = String.valueOf(romanArray[romanArray.length - 1]);
            switch (lastLetter) {
                case "I":
                    sum += 1;
                    break;
                case "V":
                    sum += 5;
                    break;
                case "X":
                    sum += 10;
                    break;
                case "L":
                    sum += 50;
                    break;
                case "C":
                    sum += 100;
                    break;
                case "D":
                    sum += 500;
                    break;
                case "M":
                    sum += 1000;
                    break;
            }
        }

        return sum;

        // BEST TIME COMPLEXITY BELOW AND EFFICIENCY
//        int ans = 0, num = 0;
//        for (int i = s.length() - 1; i >= 0; i--) {
//            switch (s.charAt(i)) {
//                case 'I':
//                    num = 1;
//                    break;
//                case 'V':
//                    num = 5;
//                    break;
//                case 'X':
//                    num = 10;
//                    break;
//                case 'L':
//                    num = 50;
//                    break;
//                case 'C':
//                    num = 100;
//                    break;
//                case 'D':
//                    num = 500;
//                    break;
//                case 'M':
//                    num = 1000;
//                    break;
//            }
//            if (4 * num < ans)
//                ans -= num;
//            else
//                ans += num;
//        }
//        return ans;
    }
}
