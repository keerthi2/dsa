package TopHundredDSA.Array.Easy;

import java.util.Arrays;
import java.util.HashSet;

public class MissingAndRepeating {

    static void main() {
        int[] data = {4, 3, 6, 2, 1, 1};
        // missingAndRepeating(data);
        missingAndRepeatingbetterApproach(data);
    }

    //Using log(n) time and o(1) space complexity;
    static public HashSet<Integer> missingAndRepeating(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                set.add(arr[i]);
            } else if (arr[i] != arr[i - 1] + 1) {
                set.add(arr[i - 1] + 1);
            }

        }
        System.out.println(set);
        return set;
    }

    //Using log(n) time and o(1) time,space complexity  respectively. this works when array contains only one missing number
    static public HashSet<Integer> missingAndRepeatingbetterApproach(int[] arr) {
        HashSet<Integer> res = new HashSet<>();
        int[] freq = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        for (int j = 1; j < freq.length; j++) {
            if (freq[j] == 0) {
                res.add(j);
            } else if (freq[j] >= 2) {
                res.add(j);
            }
        }


        System.out.println(res);
        return res;
    }

}

