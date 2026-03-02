package Array;

import java.util.Arrays;
import java.util.HashSet;

public class PairwithGivenSum {

    //reference https://www.geeksforgeeks.org/dsa/check-if-pair-with-given-sum-exists-in-array/
int[] data={1, -2, 1, 0, 5};
    public  void main() {
        System.out.println(pairOfSumwithTwoPointers(data,0));;
        System.out.println(pairOfSumwithSet(data,0));
    }

    public boolean pairOfSumwithTwoPointers(int [] array, int sum) {
        Arrays.sort(array);
       int startPointer=0;
       int lastPointer=array.length-1;


        while (startPointer<lastPointer) {

            if (array[startPointer]+array[lastPointer] == sum) {
                System.out.println("Found pair with sum "+sum+" at "+startPointer+" and "+lastPointer + "Values are "+ array[startPointer]+", "+ array[lastPointer]);
                return true;
            }
            else if (array[startPointer]+array[lastPointer] < sum) {
                startPointer++;
            } else if (array[startPointer]+array[lastPointer]>sum) {
                lastPointer--;
            }
        }
        return false;
    }

    public boolean pairOfSumwithSet(int [] array, int sum) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            int secondelement=sum-array[i];
            if (set.contains(sum-array[i]) ) {
                System.out.println("Found pair with sum Values are "+ array[i]+", "+secondelement );
                return true;
            }
            else{
                set.add(array[i]);
            }
        }
return  false;
    }

}
