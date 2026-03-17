package TopHundredDSA.Array.Easy;

public class MaximumProductOFTriplet {
    static void main() {
     int[] input =   {1, -4, 3, -6, 7, 0};
        System.out.println(maxtTriplet(input));

    }

    static public int maxtTriplet(int[] input) {
        int firstLargest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
            int thirdLargest=Integer.MIN_VALUE;

        for (int i = 0; i < input.length; i++) {
            if (input[i] > firstLargest) {
                thirdLargest=secondLargest;
                secondLargest=firstLargest;
                firstLargest=input[i];
            }
            else if (input[i] > secondLargest) {
                thirdLargest=secondLargest;
                secondLargest=input[i];
            }
            else if (input[i] > thirdLargest) {
                thirdLargest=input[i];
            }

        }
        System.out.println(firstLargest+ " "+secondLargest+" "+thirdLargest);

        return firstLargest*secondLargest*thirdLargest;
    }


}
