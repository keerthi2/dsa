package TopHundredDSA.Stack;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args){
        System.out.println(validParenthesis("]"));

    }

   static public boolean validParenthesis (String data) {
       if(data.length()==0) {
           return true;
       }
        Stack<Character> stack=new Stack<>();

       /* if(firstChar==']' || firstChar=='}' || firstChar==')' || data.length()==1) {
            return false;
        }*/

        for (int i = 0; i < data.length(); i++) {
            if(stack.isEmpty() && (data.charAt(i)==']' || data.charAt(i)=='}' || data.charAt(i)==')')) {
              return false;
            }

            if(data.charAt(i)=='(' || data.charAt(i)=='[' ||  data.charAt(i)=='{'){
                stack.push(data.charAt(i));
            }
           else if((data.charAt(i)==')' && stack.peek()=='(') || (data.charAt(i)==']' && stack.peek()=='[') || (data.charAt(i)=='}' && stack.peek()=='{'))  {
                stack.pop();
            }
           else{
               return false;
            }

        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;


    }
}
