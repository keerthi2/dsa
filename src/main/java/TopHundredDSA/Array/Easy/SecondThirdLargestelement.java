package TopHundredDSA.Array.Easy;

public class SecondThirdLargestelement {
    //https://www.geeksforgeeks.org/dsa/find-second-largest-element-array/
    static void main() {
        int[] input={19, -10, 20, 14, 2, 16, 10};
        System.out.println(secondLargest(input));
        System.out.println(thirdLargest(input));

    }
    public static int secondLargest(int[] arr) {
        int len = arr.length;
        int largest = -1;
        int secondLargest =-1;
        for (int i = 0; i < len; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > secondLargest){
               secondLargest = arr[i];
            }

        }
   return secondLargest;
    }

    public static int thirdLargest(int[] arr) {
        int len = arr.length;
        int largest = -1;
        int secondLargest =-1;
        int thirdLargest =-1;
        for (int i = 0; i < len; i++) {
            if (arr[i] > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest){
                thirdLargest=secondLargest;
                secondLargest = arr[i];
            }
            else if( arr[i] > thirdLargest){
                thirdLargest=arr[i];
            }

        }
        return thirdLargest;
    }


}
