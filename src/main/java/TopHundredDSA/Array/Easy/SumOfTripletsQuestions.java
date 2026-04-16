package TopHundredDSA.Array.Easy;

import java.util.Arrays;

public class SumOfTripletsQuestions {
    static void main() {
        sumOftriplets(new int[]{-1, -1, -1, 2, 2});
    }
    public static void sumOftriplets(int[] input) {
        //-1, -1, -1, 2, 2
        Arrays.sort(input);
        for (int i = 0; i < input.length; i++) {
            if (i > 0 && input[i] == input[i - 1]) continue;
            int first = input[i];
            int start = i + 1;
            int endIndex = input.length - 1;
            while (start < endIndex) {
                if (input[start] + input[endIndex] + first == 0 && start != i && endIndex != i) {
                    System.out.println("triplets are " + input[start] + " and " + input[endIndex] + " and " + first);
                    System.out.println(start + " " + endIndex + " " + i);
                    while (start < endIndex && input[start] == input[start + 1]) {
                        start++;
                    }
                    while (start < endIndex && input[endIndex] == input[endIndex - 1]) {
                        endIndex--;
                    }
                    start++;
                    endIndex--;
                } else if (input[start] + input[endIndex] + first > 0) {
                    endIndex--;
                } else {
                    start++;
                }
            }

        }


    }
}
