package TopHundredDSA.Array.Easy;

import java.util.ArrayList;

public class ArrayRerangePositivenegative {
    static void main() {
        int[] input={-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        ArrayList<Integer> output =arrayRerangePositivenegative(input);
        System.out.println(output.toString());
        //1,-4,2,-1,3,4
    }
    // Solution with o(n), o(n) time and space complexity repectively
    public static ArrayList<Integer> arrayRerangePositivenegative(int[] input) {
        int positiveIntIndex=0;
        int negativeIntIndex=0;
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<input.length;i++){
            if(i%2==0 || negativeIntIndex>=input.length-1){
                boolean flag=true;
                while(positiveIntIndex<input.length && flag){
                    if(input[positiveIntIndex]>=0){
                        result.add(input[positiveIntIndex]);
                        positiveIntIndex++;
                        flag=false;
                    }
                    else{
                       positiveIntIndex++;
                    }

                }

            }
            if(i%2!=0 || positiveIntIndex>=input.length-1){
                boolean flag=true;
                while(negativeIntIndex<input.length && flag){
                    if(input[negativeIntIndex]<0){
                        result.add(input[negativeIntIndex]);
                        negativeIntIndex++;
                        flag=false;
                    }
                    else{
                        negativeIntIndex++;
                    }

                }

            }

        }
        return result;
    }
}
