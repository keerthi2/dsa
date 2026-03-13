package TopHundredDSA.String;

public class LongestPalidrome { // Array and string variables (currently unused in this class)
    int[] p;
    String ms;

    // Main method to test the palindrome logic
    static void main() {
        String input = "geeksskeeg";

        // Calling longest palindrome method
        System.out.println(longestPalindrome(input));
    }

    // Brute force approach to find palindrome substring
    public static String getPalindrome1(String str) {

        int n = str.length();

        // Stores maximum palindrome length found
        int maxLengthPaildrom = 1;

        // Starting index of longest palindrome
        int start = 0;

        // -------- Check for 2 character palindrome --------
        for (int i = 0; i < n; i++) {

            // If two adjacent characters are equal
            if (str.charAt(i) == str.charAt(i + 1)) {

                start = i;
                maxLengthPaildrom = 2;
                break;
            }
        }

        // -------- Check for palindrome of length > 2 --------
        for (int i = n - 1; i > 0; i--) {

            int startIndex = 0;
            int endIndex = i;

            while (endIndex < n) {

                // Check if substring is palindrome
                if (checkPalidromOrNot(startIndex, endIndex, str)) {

                    // Update max length palindrome
                    if (endIndex - startIndex > maxLengthPaildrom) {

                        maxLengthPaildrom = endIndex - startIndex;
                        start = startIndex;

                        System.out.println("Start Index:" + start);

                        break;
                    }
                }

                // Move window
                startIndex++;
                endIndex++;
            }
        }

        return "";
    }

    // Helper method to check whether substring is palindrome
    public static boolean checkPalidromOrNot(int start, int end, String str) {

        // Compare characters from both ends
        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }


    // -------- Optimal Solution : Expand Around Center --------
    public static String longestPalindrome(String s) {

        // Edge case
        if (s == null || s.length() < 1) return "";

        // Track start and end index of longest palindrome
        int start = 0;
        int end = 0;

        // Iterate through each character as center
        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome (center at i)
            int len1 = expandFromCenter(s, i, i);

            // Even length palindrome (center between i and i+1)
            int len2 = expandFromCenter(s, i, i + 1);

            // Get maximum length
            int len = Math.max(len1, len2);

            // Update longest palindrome boundaries
            if (len > end - start) {

                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        // Return longest palindrome substring
        return s.substring(start, end + 1);
    }

    // Expand from center and return palindrome length
    public static int expandFromCenter(String s, int left, int right) {

        // Expand while characters match
        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        // Length of palindrome
        return right - (left + 1);
    }

}
