
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{12,15,45,65,23,10};
        int target = 27;
        int[] twoSum = twoSum(nums, target);
        System.out.println(twoSum[0]);
        System.out.println(twoSum[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length ;i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return nums;
    }

}

