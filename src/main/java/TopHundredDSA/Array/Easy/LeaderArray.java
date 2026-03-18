package TopHundredDSA.Array.Easy;

import java.util.ArrayList;

public class LeaderArray {
    static void main() {
        int [] nums={16, 17, 4, 3, 5, 2};
        System.out.println(leaderArray(nums).toString());

    }
    //Using O(n) and 0(1) time and space complexity respectively
    public static ArrayList<Integer> leaderArray(int[] nums) {
        ArrayList<Integer> result=new ArrayList<>();
        result.add(nums[nums.length-1]);
        int leader=nums[nums.length-1];
        for(int i= nums.length-2;i>=0;i--){
            if(nums[i]>leader){
             leader=nums[i];
             result.add(leader);
            }
        }


        return result;
    }
}
