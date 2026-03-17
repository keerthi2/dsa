package TopHundredDSA.Array.Easy;

import java.util.Arrays;

public class SortArrayInWayForm {

    static void main() {
        int[] data = {2, 4, 7, 8, 9, 10};
        sortArrayInWayForm(data);
        System.out.println(Arrays.toString(data));
    }
//using o(n) and o(1) time and space complexity respectively
    public static void sortArrayInWayForm(int[] input) {
        for (int i = 0; i < input.length - 1; i += 2) {
            int temp = input[i];
            input[i] = input[i + 1];
            input[i + 1] = temp;
        }
    }


}
