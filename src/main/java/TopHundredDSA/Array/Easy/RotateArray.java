package TopHundredDSA.Array.Easy;

import java.util.Arrays;

public class RotateArray {

    static void main() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] input1 = {1, 2, 3};
        int d = 4;
        System.out.println(Arrays.toString(rotateArray(input1, d)));
    }

    public static int[] rotateArray(int[] arr, int k) {
        int[] result = new int[arr.length];
        int outputindex = 0;
        int k1 = k % arr.length;
        for (int i = k1; i < arr.length; i++) {
            result[outputindex] = arr[i];
            outputindex++;
        }
        int startIndex = 0;
        while (startIndex < k1 && outputindex < arr.length) {
            result[outputindex] = arr[startIndex];
            outputindex++;
            startIndex++;
        }
        return result;


    }
}
