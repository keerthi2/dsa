package TopHundredDSA.String;

import java.util.Arrays;

public class ReverseWithoutAffectingSpecialChar {
    static void main() {
        String data = "Ab,c,de!$";
        reverseWithoutAffectingSpecialChar(data);

    }

    public static void reverseWithoutAffectingSpecialChar(String str) {
        char[] chars = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isAlphabetic(str.charAt(i))) {
                chars[i] = str.charAt(i);
            }
        }
        System.out.println(Arrays.toString(chars));
        int index=str.length()-1;
        int startingIndex=0;
        while(index>=0 && startingIndex<str.length()) {
            if(chars[startingIndex]=='\u0000' & Character.isAlphabetic(str.charAt(index))){
             chars[startingIndex]=str.charAt(index);
             startingIndex++;
             index--;
            }
          else if(!Character.isAlphabetic(str.charAt(index))){
                index--;
            }
          else if(chars[startingIndex]!='\u0000'){
               startingIndex++;
           }
        }
        System.out.println(String.valueOf(chars));
    }

}
