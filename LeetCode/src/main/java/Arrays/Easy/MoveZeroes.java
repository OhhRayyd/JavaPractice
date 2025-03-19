package Arrays.Easy;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int firstPointer = 0;

        while (firstPointer < nums.length){
            if(nums[firstPointer] == 0){

                int tempPointer = firstPointer;
                while(tempPointer < nums.length && nums[tempPointer] == 0){
                    tempPointer++;
                }

                if(tempPointer < nums.length){
                    nums[firstPointer] = nums[tempPointer];
                    nums[tempPointer] = 0;
                }
            }
            firstPointer++;
        }
    }
}
