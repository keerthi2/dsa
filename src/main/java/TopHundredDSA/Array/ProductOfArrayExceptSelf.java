package TopHundredDSA.Array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    int[] data = {10, 3, 5, 6, 2};

    void main() {
        System.out.println(Arrays.toString(productExceptSelf(data)));
        System.out.println(Arrays.toString(productExceptSelfUsingStreams(data)));
    }

    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int product = 1;
        /**/
        for (int num : nums) {
            product *= num;
        }
        for (int i = 0; i < nums.length; i++) {
            res[i] = product / nums[i];
        }
        return res;
    }

    public int[] productExceptSelfUsingStreams(int[] nums) {
        int product=Arrays.stream(nums).reduce(1, (x, y) -> x * y);
       return  Arrays.stream(nums).map(x ->product/x).toArray();
    }

}
