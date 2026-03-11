package TopHundredDSA.String;

import java.util.Arrays;
public class SmallerSubStringPresent {


    static void main() {
        String s = "zoomlazapzo";
        String p = "oza";
        String s1="timetopractice";
        String p2="toc";

     //   String res = minWindow2(s, p);
        System.out.println(minWindow2(s, p));
       // System.out.println(minWindow2(s1, p2));
    }
    public static String minWindow2(String s, String p) {
        int len1 = s.length();
        int len2 = p.length();
        int[] countP = new int[256];
        int[] countS = new int[256];
        int lengthOfMatchingChar=0;
        String output = "";
       //  Storing it to Index
        for (int i = 0; i <len2; i++) {
        countP[p.charAt(i)]++;
        }
        int start=0;
        for (int j = 0; j <len1 ; j++) {
            countS[s.charAt(j)]++;
            if (countS[s.charAt(j)] <= countP[s.charAt(j)] && countP[s.charAt(j)] > 0) {
                lengthOfMatchingChar++;
            }
            if (lengthOfMatchingChar == len2) {
                while(lengthOfMatchingChar == len2) {
                   if(countS[s.charAt(start)]==countP[s.charAt(start)]){
                        lengthOfMatchingChar--;
                    }
                    countS[s.charAt(start)]--;
                    start++;
                }
             if (output.length()<(j-start+1)) {
              output=s.substring(start-1,j+1);
             }
            }

            
        }
        return output;
    }

    public static String minWindow(String s, String p) {
        int len1 = s.length();
        int len2 = p.length();

        if (len1 < len2)
            return "";

        int[] countP = new int[256];
        int[] countS = new int[256];

        // Store occurrence of characters of P
        for (int i = 0; i < len2; i++)
            countP[p.charAt(i)]++;

        int start = 0, start_idx = -1, min_len = Integer.MAX_VALUE;
        int count = 0;

        for (int j = 0; j < len1; j++) {
            char currChar = s.charAt(j);

            // Count occurrence of characters of string S
            countS[currChar]++;

            // If S's char matches with P's char, increment count
            if (countP[currChar] > 0 && countS[currChar] <= countP[currChar]) {
                count++;
            }

            // If all characters are matched
            if (count == len2) {

                // Try to minimize the window
                char startChar;
                while (countS[startChar = s.charAt(start)] > countP[startChar] || countP[startChar] == 0) {
                    if (countS[startChar] > countP[startChar]) {
                        countS[startChar]--;
                    }
                    start++;
                }

                // Update window size
                int len = j - start + 1;
                if (min_len > len) {
                    min_len = len;
                    start_idx = start;
                }
            }
        }

        if (start_idx == -1)
            return "";

        return s.substring(start_idx, start_idx + min_len);
    }


}
