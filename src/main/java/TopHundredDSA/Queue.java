package TopHundredDSA;

import java.util.PriorityQueue;

public class Queue {

    static void main() {
        int[] data= {1,2,3,4};
        System.out.println(findKthLargestElement(data,1));
    }

   static public int findKthLargestElement(int [] input, int k){
       PriorityQueue<Integer> queue=new PriorityQueue<>((a,b)->b-a);
       for (int i = 0; i <input.length ; i++) {
           queue.add(input[i]);
       }
       int index=1;
       while (!queue.isEmpty()){
           if(index==k){
               return queue.poll();
           }
           queue.poll();
           index++;
       }
return -1;
    }
}
