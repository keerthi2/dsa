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

    //Without using division function
    public static int[] productOfArrayWithoutSelf(int[] input) {
        int[] leftProduct = new int[input.length];
        //1, 2, 3, 4
        leftProduct[0] = 1;
        for (int i = 1; i < input.length; i++) {
            leftProduct[i] = leftProduct[i - 1] * input[i - 1];
        }

        int[] rightProduct = new int[input.length];
        rightProduct[input.length - 1] = 1;
        for (int j = input.length - 2; j >= 0; j--) {
            rightProduct[j] = rightProduct[j + 1] * input[j + 1];
        }
        for (int i = 0; i < input.length; i++) {
            input[i] = leftProduct[i] * rightProduct[i];
        }
        return input;
    }



}
