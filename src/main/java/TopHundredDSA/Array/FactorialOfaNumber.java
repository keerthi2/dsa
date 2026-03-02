package TopHundredDSA.Array;

import TopHundredDSA.LinkedList.Node;

import java.util.ArrayList;


public class FactorialOfaNumber {
    ArrayList<Integer> res=new ArrayList<>();
     void main() {
       // factorial(7);
         //System.out.println(res.toString());
         Node head=new Node(1);
         factorial2(5,head);
         factorial(4);

    }

    private void factorial2(int n, Node head) {
        for (int i = 2; i <=n; i++) {
            multiplyandStore(i,head);

        }
    }
// Why this Approach?
// Factorial grows very fast and can overflow int/long for large inputs.


    public ArrayList<Integer> factorial(int n){
         res.add(1);
         int carry=0;
         for(int i=2;i<=n;i++){
             for (int j = 0; j < res.size() ; j++) {
                 int temp=i*res.get(j)+carry;
                 res.set(j,temp%10);
                 carry=temp/10;
             }
             while(carry!=0){
                 res.add(carry%10);
                 carry=carry/10;
             }

         }
         return res;
    }

    public void multiplyandStore(int n, Node head) {
            int carry=0;
            Node curr=head;
            Node prev=head;
            while (curr != null) {
                int multipliedData =curr.data*n+carry;
                curr.data = multipliedData%10;
                carry = multipliedData/10;
                prev = curr;
                curr=curr.prev;
            }
            while(carry!=0){
                prev.prev=new Node(carry%10);
                carry=carry/10;
                prev=prev.prev;
            }
    }

}
