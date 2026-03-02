package TopHundredDSA.Array;

public class MaxProfitPorblem {
    int[] data= {1, 3, 6, 9, 11};
//follow this link for explanation
     void main() {
         System.out.println(maxProfit(data));
     }
    public int maxProfit(int[] prices){
        int min=prices[0];
        int maxProfit=0;

        for (int price : prices) {
            maxProfit = Math.max(price - min, maxProfit);
            min = Math.min(price, min);
        }

return  maxProfit;
    }

}
