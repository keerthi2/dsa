package TopHundredDSA.Array;

import java.util.ArrayList;

public class InsertMergeInterval {

    void main() {
      //  int[][] arr = {{1, 3}, {4, 5}, {6, 7}, {8, 10}};
       // int[] newInterval={5,6};

       int[][] arr= {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval={4,9};
        System.out.println(mergeInterval(arr,newInterval).toString());

    }
// https://www.geeksforgeeks.org/dsa/insert-in-sorted-and-non-overlapping-interval-array/
    public ArrayList<int[]> mergeInterval(int[][] intervals, int[] newInterval) {
        //Store the non overlapping intervals
        int i=0;
        int length=intervals.length;
        ArrayList<int[]> res=new ArrayList<>();
 // Store all the non overlapping elements firts
        while (i<length && intervals[i][1]<newInterval[0]){
            res.add(intervals[i]);
            i++;
        }
        //find and store the new overlapping to have unique overlapping
        while(i<length && intervals[i][0]<=newInterval[1] ){
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        }

        res.add(newInterval);
        // store the none overlapping once the overlapping intervals are merged
        while(i<length){
            res.add(intervals[i]);
            i++;
        }
        return  res;
    }

}
