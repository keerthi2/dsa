package Array;

public class MaxProfitPorblem {
    int[] data= {1, 3, 6, 9, 11};
//follow this link for explanation
     void main() {
         System.out.println(maxProfit(data));
     }
    public int maxProfit(int[] prices){
        int min=prices[0];
        int maxProfit=0;

        for (int i = 0; i <prices.length ; i++) {
            maxProfit=Math.max(prices[i]-min,maxProfit);
            min=Math.min(prices[i],min);
        }

return  maxProfit;
    }

}
