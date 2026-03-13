package TopHundredDSA.String;

public class LongestPalidrome {
    int[] p;
    String ms;
    public static void main() {
         String input="forgeeksskeegfor";
        getPalindrome1(input);

    }

    public static String getLongestPal(String s) {

        int n = s.length();
        boolean[][] dp = new boolean[n][n];

        // dp[i][j] if the substring  from [i to j]
        // is a palindrome or not

        int start = 0, maxLen = 1;

        // all substrings of length 1 are palindromes
        for (int i = 0; i < n; ++i) dp[i][i] = true;

        // check for substrings of length 2
        for (int i = 0; i < n - 1; ++i) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;

                if(maxLen == 1){
                    start = i;
                    maxLen = 2;
                }
            }
        }

        // check for substrings of length 3 and more
        for (int len = 3; len <= n; ++len) {
            for (int i = 0; i <= n - len; ++i) {
                int j = i + len - 1;

                // if s[i] == s[j] then check for
                //  i [i+1  --- j-1] j
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;

                    if(len > maxLen){
                        start = i;
                        maxLen = len;
                    }
                }
            }
        }

        return s.substring(start, start + maxLen);
    }

    public static String getPalindrome1(String str) {
        int n = str.length();
       int maxLengthPaildrom=1;
       int start = 0;

       //for 2 letter Palindroms

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                start = i ;
                maxLengthPaildrom = 2;
                break;
            }
        }
// For more charactor
       for (int i = n-1; i >0; i--) {
           int startIndex=0;
           int endIndex=i;
           //boolean exitLoops=true;
           while (endIndex<n) {
               if(checkPalidromOrNot(startIndex,endIndex+1, str)){
                   if(endIndex-startIndex>maxLengthPaildrom){
                       maxLengthPaildrom=endIndex-startIndex;
                       start=startIndex;
                       System.out.println("Start Index:"+start );
                       break;
                   }
               }
               startIndex++;
               endIndex++;
           }

       }
return "";
    }

   public static boolean checkPalidromOrNot(int start, int end, String str){

        StringBuffer data=new StringBuffer(str.substring(start,end));
        String revresedData=data.reverse().toString();
        if(revresedData.equalsIgnoreCase(str.substring(start,end))){
            return true;
        }
        else{
           return false;
       }
   }




}
