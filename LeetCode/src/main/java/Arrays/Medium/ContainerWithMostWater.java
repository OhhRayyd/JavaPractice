package Arrays.Medium;

public class ContainerWithMostWater {

    public static void main(String[] args){
        int[] height = {2,8,12,1,6,10,1,2,5};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height){
        int maxArea = 0;
        int distance = height.length - 1;
        int firstPointer = 0;
        int lastPointer = height.length - 1;

        while(firstPointer < lastPointer) {
            int currentLeftHeight = height[firstPointer];
            int currentRightHeight = height[lastPointer];
            int area = Math.min(currentLeftHeight, currentRightHeight) * distance--;
            maxArea = Math.max(area, maxArea);
            if(currentLeftHeight > currentRightHeight){
                lastPointer--;
            } else {
                firstPointer++;
            }
        }
        return maxArea;
    }
}
