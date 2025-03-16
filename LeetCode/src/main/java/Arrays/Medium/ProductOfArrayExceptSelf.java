package Arrays.Medium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] answer = productExceptSelf(nums);

        for( int num : answer ){
            System.out.println(num);
        }
    }


    public static int[] productExceptSelf(int[] nums) {
//        int[] answer = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//
//            int[] filteredNums = new int[nums.length - 1];
//            int k = 0;
//
//            for (int j = 0; j < nums.length; j++) {
//                if (j != i) {
//                    filteredNums[k++] = nums[j];
//                }
//            }
//            answer[i] = Arrays.stream(filteredNums)
//                    .reduce(1, (a, b) -> a * b);
//        }
//        return answer;

        int n = nums.length;
        int[] answer = new int[n];

        // Step 1: Compute prefix products
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Step 2: Compute suffix products on the fly and multiply with prefix
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i];
        }

        return answer;
    }

}
