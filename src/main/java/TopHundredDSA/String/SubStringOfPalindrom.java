package TopHundredDSA.String;

import java.util.HashSet;

public class SubStringOfPalindrom {
   static int outputcount=0;
   static String outputString="";
  static HashSet<String> set=new HashSet<>();
     void main() {
         String input="forgeeksskeegfor";
         for (int i = 0; i <input.length() ; i++) {
             //For even number
             ExpandFromCenter(input,i,i+1);
             //For Odd number
             ExpandFromCenter(input,i-1,i+1);

         }
         System.out.println(outputcount);
       //  System.out.println(set);
         System.out.println(outputString);

    }

    public void ExpandFromCenter(String input,int left,int right) {
         while(left>=0 && right<input.length()){
             if(input.charAt(left)==input.charAt(right)){
                 if(outputString.length()<=input.substring(left,right+1).length()){
                     outputString=input.substring(left,right+1);
                 }
                 outputcount++;

             }
             else{
                 break;
             }
             left--;
             right++;

         }



    }
}
