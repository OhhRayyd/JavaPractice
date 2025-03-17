package Arrays.Medium;

public class IncreasingTripletSubsequence {

    public static void main(String[] args) {
        int[] nums = {20, 100, 10, 12, 5, 13};
        System.out.println(increasingTriplet(nums));
    }

    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;  // Update smallest number
            } else if (num <= second) {
                second = num; // Update second smallest
            } else {
                return true;  // Found third number greater than first and second
            }
        }
        return false;
    }
}
