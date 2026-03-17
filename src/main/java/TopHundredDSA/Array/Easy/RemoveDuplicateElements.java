package TopHundredDSA.Array.Easy;

import java.util.ArrayList;

public class RemoveDuplicateElements {

    static void main() {
        int[] input = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        System.out.println(removeDuplicateElements(input).toString());

    }
//Using O(n) and O(n) time and Space complexity
    public static ArrayList<Integer> removeDuplicateElements(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[i-1]){
              result.add(nums[i]);
            }
        }
        return result;
    }
}
