package TopHundredDSA.Stack;

import java.util.Stack;

public class DailyTemperature {
    static void main() {
        dailyTemperatures(new int[]{73,74,75,71,69,72,76,73});

    }

    public static int[] dailyTemperatures(int[] temperatures) {
        //73,74,75,71,69,72,76,73
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = 0;
            } else {
                result[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return result;

    }
}
