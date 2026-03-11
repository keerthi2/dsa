package TopHundredDSA.String;

public class SentencePalindromeOrnot {

     void main() {
         String str = "ABC $. def01ASDF..";
         System.out.println(palindromeOrnot(str));
    }

    public static boolean palindromeOrnot(String str) {
         String finalString=removeNonAphaabhetic(str);
         int start=0; int end=finalString.length()-1;
         while(start<end){
             if(finalString.charAt(start)==finalString.charAt(end)){
                 start++;
                 end--;
             }
             else{
                return false;
             }
         }
         return true;


    }

    public static String removeNonAphaabhetic(String str) {
         String output = "";
         for (int i = 0; i < str.length(); i++) {
             if(Character.isAlphabetic(str.charAt(i)) ||  Character.isDigit(str.charAt(i))){
                 output += str.charAt(i);
             }
         }
         return output.toLowerCase();
    }
}
