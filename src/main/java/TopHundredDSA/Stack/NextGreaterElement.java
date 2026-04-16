package TopHundredDSA.Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    static void main() {
        nextGreaterElement(new int[]{6, 8, 0, 1, 3});
    }

    public static int[] nextGreaterElement(int[] input) {
        //6, 8, 0, 1, 3
        int[] output = new int[input.length];
        Stack<Integer> stack = new Stack<>();
        output[input.length - 1] = -1;
        stack.push(input[input.length - 1]);
        for (int i = input.length - 2; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= input[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                output[i] = -1;
            } else {
                output[i] = stack.peek();
            }
            stack.push(input[i]);


        }

        System.out.println(Arrays.toString(output));
        return input;
    }
}
