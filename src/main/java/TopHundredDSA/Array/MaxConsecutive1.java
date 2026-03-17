package TopHundredDSA.Array;

public class MaxConsecutive1 {
    static void main() {
        int[] input={0, 0, 1, 0, 1, 0};
        System.out.println(maxConsecutive1(input));
    }
    public static int maxConsecutive1(int[] input) {
        int output=0;
        int oneTemp=0;
        int zeroTemp=0;


        for(int i=0;i<input.length;i++){
            if(input[i]==1){
                oneTemp++;
            }
            else{
                oneTemp=0;
            }
            if(input[i]==0){
                zeroTemp++;
            }
            else{
                zeroTemp=0;
            }
 output=Math.max(Math.max(oneTemp,zeroTemp),output);

        }
        return output;
    }


}
