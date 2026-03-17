package TopHundredDSA.Array.Easy;

import java.util.Arrays;

public class MoveZerosToEnd {

    static  int[] data={0, 0};

    static void main() {
        System.out.println(Arrays.toString(moveZerosToEnd1(data)));
        System.out.println(Arrays.toString(moveZerosToEnd(data)));

    }
// Using 0(n) and o(1) time and space complexity respectively
   static public int[] moveZerosToEnd(int[] input) {
        int[] output=new int[input.length];
        int startIndex=0;
        int endIndex=input.length-1;
        for (int i = 0; i <input.length ; i++) {
            if (input[i]!=0) {
            output[startIndex]=input[i];
            startIndex++;
            } else {
                output[endIndex]=input[i];
                endIndex--;
            }

        }
        return output;

    }
//Using o(n) and o(1) solution
    static public int[] moveZerosToEnd1(int[] input) {
        int count=0;
        for (int i = 0; i <input.length ; i++) {
            if (input[i]!=0) {
               int temp=input[i];
               input[i]=input[count];
               input[count++]=temp;
            }
        }
     return input;
    }

}
