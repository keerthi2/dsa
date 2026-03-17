package TopHundredDSA.Array;

import java.util.ArrayList;

public class BuySellProfit {
    static void main() {
        int[] input = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(profitCalculation(input));
        System.out.println(profitCalculationMultipleTransction(input));
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


    static public int profitCalculationMultipleTransction(int[] input) {
        int minsellingPrice = input[0];
        int profit = 0;
        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 1; i < input.length; i++) {
            if (input[i] < minsellingPrice || input[i] < input[i - 1] ) {
                profit+=input[i-1] - minsellingPrice;
                minsellingPrice = input[i];
            } else if(input[i] > minsellingPrice && i==input.length-1) {
                profit+=input[i] - minsellingPrice;
                minsellingPrice = input[i];
            }

        }
        return profit;
    }

}
