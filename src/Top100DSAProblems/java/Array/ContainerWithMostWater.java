package Array;

public class ContainerWithMostWater {
    int[] arr={8, 7, 8, 6, 4, 6, 5, 8};
     void main() {
         System.out.println(maxArea(arr));;
    }
//o(n)
    public int maxArea(int[] nums) {
         int maxSum = 0;
         int startPointer=0;
         int endPointer=nums.length-1;
         while(startPointer<endPointer) {
             maxSum = Math.max(maxSum, Math.min(nums[startPointer],nums[endPointer]) * (endPointer-startPointer));
             if (nums[startPointer] > nums[endPointer]) {
                 endPointer--;
             }
             else{
                 startPointer++;
             }
         }


return  maxSum;
    }

}
