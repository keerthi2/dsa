package TopHundredDSA.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArray {

    static void main() {
      int k=3;
        int[] input={1, 2, 3, 4, 5, 6, 7, 8};
        ArrayList<Integer> output=new ArrayList<>();
        for (int i = input.length-1; i >0 ; i--) {
            output.add(input[i]);
        }
        System.out.println(Arrays.toString(output.toArray()));
        System.out.println(Arrays.toString(reverseAnArrayBasedOngivenSize(input,k)));
    }

    public static int[] reverseAnArrayBasedOngivenSize(int[] input, int k) {

        for (int i=0; i < input.length; i+=k) {
             int left=i;
             int right=Math.min(i+k-1,input.length-1);

             while (left<right) {
              int temp=input[left];
              input[left]=input[right];
              input[right]=temp;
                 left++;
                 right--;
             }

        }

return input;


    }
}
