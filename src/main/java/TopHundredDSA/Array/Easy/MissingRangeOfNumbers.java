package TopHundredDSA.Array.Easy;

import java.util.ArrayList;

// Source : https://www.geeksforgeeks.org/dsa/missing-ranges-of-numbers/
public class MissingRangeOfNumbers {
    static int arr[] = {-48, -10, -6, -4, 0, 4, 17};
    static int lower = -54, upper = 17;

    //Output:[[-54, -49], [-47, -11], [-9, -7], [-5, -5], [-3, -1], [1, 3], [5,16]]
    static void main(String[] args) {
        missingRangeOfNumbers(arr, lower, upper);
    }

    public static ArrayList<int[]> missingRangeOfNumbers(int[] arr, int lowerNumber, int upperNumber) {
        int lower = lowerNumber;
        int upper = upperNumber;
        ArrayList<int[]> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > lower) {
                int[] temp = new int[2];
                temp[0] = lower;
                temp[1] = arr[i] - 1;
                list.add(temp);
            }
            lower = arr[i] + 1;

        }

        if (arr[arr.length - 1] < upper) {
            int[] temp = new int[2];
            temp[0] = lower;
            temp[1] = upper;
            list.add(temp);
        }
        return list;
    }
}
