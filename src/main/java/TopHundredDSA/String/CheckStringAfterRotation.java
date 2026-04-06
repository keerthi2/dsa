package TopHundredDSA.String;

import java.util.HashMap;

public class CheckStringAfterRotation {
    static void main() {
        String s1 = "abcd", s2 = "acbd";
        System.out.println(checkIsomorficOrNot(s1, s2));
    }
    static boolean checkIsomorficOrNot(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
       String outputString=s1.concat(s2);
        for (int i = 1; i < outputString.length()-s1.length(); i++) {
            if (outputString.charAt(i-1) != outputString.charAt(i)) {
                return true;
            }

        }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char ch: map.keySet()){
        }
        return false;
    }
}
