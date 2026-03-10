package TopHundredDSA.String;

public class MaxRepeatingCharactor {
    static void main() {
        System.out.println(maxRepeatingCharactor("aaaa"));

    }
    public static char maxRepeatingCharactor(String s) {
        char output=s.charAt(0);
        int outputLength=1;
        int temp=1;
        for (int i = 1; i < s.length(); i++) {
           if(s.charAt(i-1)==s.charAt(i)){
              temp++;
           }
           else if(temp>outputLength) {
              outputLength=temp;
              output=s.charAt(i-1);
              temp=1;
           }
        }
        System.out.println(outputLength);
     return output;
    }
}
