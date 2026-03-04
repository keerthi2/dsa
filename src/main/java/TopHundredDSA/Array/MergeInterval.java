package TopHundredDSA.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeInterval {

     void main() {
           int[][] arr = {{1, 3}, {4, 5},{5,6}, {6, 7}, {8, 10}};
         // int[] newInterval={5,6};
         int[][] array={{1, 3}, {2, 4}, {6, 8}, {9, 10}};
merge(arr);
    }

  public ArrayList merge(int[][] intervals) {
      Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
      ArrayList<int[]> res = new ArrayList<>();
      res.add(intervals[0]);
      for (int i = 1; i < intervals.length; i++) {
          if(intervals[i][0]<=res.get(res.size()-1)[1]){
              int[] temp=res.get(res.size()-1);
              temp[1]=Math.max(intervals[i][1],temp[1]);
              res.set(res.size()-1,temp);
          }
          else{
              res.add(intervals[i]);
          }
      }
return res;
    }


}
