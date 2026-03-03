package TopHundredDSA.Array;

public class TrappingRainWater {

    void main() {
        int[] data = {3, 0, 1, 0, 4, 0, 2};
        System.out.println(trap(data));
    }

    //Source: https://www.geeksforgeeks.org/dsa/trapping-rain-water/
    //Implentation is slightly different
    public int trap(int[] height) {
        int res = 0;
        //CalculateleftmaxArray
        int leftmax = height[0];
        int[] leftmaxArray = new int[height.length];
        for (int i = 0; i < height.length; i++) {
            leftmax = Math.max(leftmax, height[i]);
            leftmaxArray[i] = leftmax;
        }
        //Calculaterightmaxarray
        int[] rightmaxArray = new int[height.length];
        int rightmax = height[height.length - 1];
        for (int j = height.length - 1; j >= 0; j--) {
            rightmax = Math.max(rightmax, height[j]);
            rightmaxArray[j] = rightmax;
        }
        for (int i = 0; i < height.length; i++) {
            res += Math.min(leftmaxArray[i], rightmaxArray[i]) - height[i];
        }
        return res;
    }

}
