package Array;

public class MaxSubArray {

    /*Input: arr[] = []
    Output: 11
    {2, 3, -8, 7, -1, 2, 3};
    Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.*/
    int[] nums = {-2, -4};

    void main() {
        System.out.println(maxSubArray(nums));
        System.out.println(maxSubArrayBruteForce(nums));
    }

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            maxSum = Math.max(currSum, maxSum);
            currSum = Math.max(currSum, 0);
        }
        return maxSum;
    }

    public int maxSubArrayBruteForce(int[] nums) {
        int maxSum = nums[0];
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                currSum += nums[j];
                ;
            }
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }


}
