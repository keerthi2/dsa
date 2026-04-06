package TopHundredDSA.String;

import java.util.ArrayList;

public class NumbertoString {
    static String[] singleNumber = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    static String[] tens = {"", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    static ArrayList<String[]> list = new ArrayList<>();


    static void main() {
        int input = 1000;
        System.out.println(covertNumberTOString(input));
    }

    public static String covertNumberTOString(int input) {
        String output = "";
        while (input > 100) {
            if(input / 10000000>0){
                output = covertIntToString(input / 10000000, output, "Crore");
                input = input % 10000000;
            }
            if(input / 100000>0){
                output = covertIntToString(input / 100000, output, "lakhs");
                input = input % 100000;
            }
            if(input / 1000>0){
                output = covertIntToString(input / 1000, output, "thousands");
                input = input % 1000;
            }
            if(input / 100>0){
                output = covertIntToString(input / 100, output, "Hundred");
                input = input % 100;
            }

        }
        if(input<=19){
            output = output + singleNumber[input]+" ";
        }
        else{

                output = output + tens[(input / 10)-1]+" ";
                input = input % 10;

            if(input>0){
                output = output + singleNumber[input]+" ";
            }

        }

        return output;
    }

    static String covertIntToString(int input, String output, String digitSize) {
        while (input > 0) {
            if (input <= 19) {
                output = output + singleNumber[input]+" ";
                break;
            } else {
                output = output + tens[(input % 10)-1];
            }
            input = input / 10;
            output = output+" ";
        }
        output = output + digitSize +" ";
        return output;
    }


}
