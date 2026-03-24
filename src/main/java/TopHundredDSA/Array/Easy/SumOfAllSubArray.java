package TopHundredDSA.Array.Easy;

public class SumOfAllSubArray {

    static void main() {
        int[] arr = {1, 2,3,4};
        System.out.println(sumOfAllSubArray(arr));
    }
    public static int sumOfAllSubArray(int[] arr) {
        int res = 0;
         for (int i = 0; i < arr.length; i++) {
             res += (arr[i]*(i+1)*(arr.length-i));
         }
         return res;
    }
}
