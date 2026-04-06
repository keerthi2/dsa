package TopHundredDSA.String;

import java.util.HashMap;

public class IsomorficOrNot {

    static void main() {
        String s1 = "aab", s2 = "xxz";
        System.out.println(checkIsomorficOrNot(s1, s2));
    }

   public  static boolean checkIsomorficOrNot(String s1, String s2) {
       HashMap<Character, Character> map = new HashMap<Character, Character>();
        for (int i = 0; i < s1.length(); i++) {
            if (map.containsKey(s1.charAt(i))) {
                if(!map.get(s1.charAt(i)).equals(s2.charAt(i))){
                    return false;
                }
            }
            else {
                map.put(s1.charAt(i), s2.charAt(i));
            }



        }


         return true;
    }
}
