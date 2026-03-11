package TopHundredDSA.String;

import java.util.ArrayList;
import java.util.List;

public class GroupAnagrams {
    void main() {
        String[] string = {"act", "god", "cat", "dog", "tac"};
        String[] data2 = {"listen", "silent", "enlist", "abc", "cab", "bac", "rat", "tar", "art"};
        List<List<String>> response = groupAnagrams(data2);
        groupAnagrams(string);
    }

    public static List<List<String>> groupAnagrams(String[] input) {
        List<List<String>> output = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.add(input[0]);
        for (int i = 0; i < input.length; i++) {
            boolean flag = true;
            for (int j = 0; j < output.size(); j++) {
                if (checkAnagrams(input[i], output.get(j).get(0))) {
                    output.get(j).add(input[i]);
                    flag = false;
                }

            }
            if (flag) {
                List<String> listlast = new ArrayList<>();
                listlast.add(input[i]);
                output.add(listlast);
            }

        }

        return output;
    }

    public static boolean checkAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (!s2.contains(String.valueOf(s1.charAt(i)))) {
                return false;
            }

        }
        return true;
    }


}
