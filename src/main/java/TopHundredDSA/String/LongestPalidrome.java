package TopHundredDSA.String;

public class LongestPalidrome {
    int[] p;
    String ms;

     static void main() {
        String input = "forgeeksskeegfor";
        getPalindrome1(input);

    }


    public static String getPalindrome1(String str) {
        int n = str.length();
        int maxLengthPaildrom = 1;
        int start = 0;

        //for 2 letter Palindroms

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                start = i;
                maxLengthPaildrom = 2;
                break;
            }
        }
// For more charactor
        for (int i = n - 1; i > 0; i--) {
            int startIndex = 0;
            int endIndex = i;
            //boolean exitLoops=true;
            while (endIndex < n) {
                if (checkPalidromOrNot(startIndex, endIndex + 1, str)) {
                    if (endIndex - startIndex > maxLengthPaildrom) {
                        maxLengthPaildrom = endIndex - startIndex;
                        start = startIndex;
                        System.out.println("Start Index:" + start);
                        break;
                    }
                }
                startIndex++;
                endIndex++;
            }

        }
        return "";
    }

    public static boolean checkPalidromOrNot(int start, int end, String str) {

        StringBuffer data = new StringBuffer(str.substring(start, end));
        String revresedData = data.reverse().toString();
        if (revresedData.equalsIgnoreCase(str.substring(start, end))) {
            return true;
        } else {
            return false;
        }
    }


}
