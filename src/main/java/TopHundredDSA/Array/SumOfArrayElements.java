package TopHundredDSA.Array;

import java.util.Arrays;

public class SumOfArrayElements {



    static void main() {
        int[] input={9,9,9};
        System.out.println(Arrays.toString(sortArrayElements(input,1)));
    }
    public static int[] sortArrayElements(int[] input, int carryNumberGiven) {
        int carry=carryNumberGiven;
        for (int i = input.length-1; i>=0; i--) {
           int sum=input[i]+carry;
           input[i]=sum%10;
           carry=sum/10;
        }

        if (carry!=0){
           int[] res=new int[input.length+1];
           res[0]=carry;
           System.arraycopy(input, 0, res, 1, input.length);
           return res;
        }
        return input;

    }
}
