package TopHundredDSA.Stack;

import java.util.Stack;

public class StockSpan {
    static void main() {
      stockSpan(new int[]{100,80,60,70,60,75,85})  ;
    }
    public static int[] stockSpan(int[] stockPrice) {
        //100,80,60,70,60,75,85
        //1,1,1,2,1,4,6
        int[] output = new int[stockPrice.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < stockPrice.length; i++) {
            while (!stack.isEmpty() && stockPrice[stack.peek()] <= stockPrice[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                output[i] = i + 1;
            } else {
                output[i] = i - stack.peek();
            }
            stack.push(i);
        }
        return output;
    }
}
