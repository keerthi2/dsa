package TopHundredDSA.String;

import java.util.HashMap;
//https://www.geeksforgeeks.org/dsa/length-of-the-longest-substring-without-repeating-characters/

// Solved SubstringOfrepeatingChar using Sliding window
public class SubstringWithoutRepeatingCharector {
    String data="abcdefabcbb";


     void main() {
         System.out.println(substringWithoutRepeatingChar(data));
    }

    public int substringWithoutRepeatingChar(String s) {
         int output=0;
         int start = 0;
         int end = 0;
         HashMap<Character, Integer> map = new HashMap<>();
        while(end<s.length()){
           if(map.containsKey(s.charAt(end))){
             start=Math.max(map.get(s.charAt(end))+1,start);
           }
           output =Math.max(output,end-start+1);
           map.put(s.charAt(end),end);
           end++;
        }



       return output;
    }

}
