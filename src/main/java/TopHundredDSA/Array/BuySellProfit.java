package TopHundredDSA.Array;

public class BuySellProfit {
    static void main() {
        int[] input = {1, 3, 6, 9, 11};
        System.out.println(profitCalculation(input));
    }
 //Using o(n) and o(1) solution for time and space complexity respectively
    static public int profitCalculation(int[] input) {
        int minsellingPrice = input[0];
        int profit = 0;

        for (int i = 1; i < input.length; i++) {
            if (input[i] < minsellingPrice) {
                minsellingPrice = input[i];
            } else {
                profit = Math.max(profit, input[i] - minsellingPrice);
            }

        }
        return profit;
    }
}
