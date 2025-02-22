package strings;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
    public static void main(String[] args) {
        System.out.println("getPermutedStrings(\"abcd\") = " + getPermutedStrings("abcd"));
    }
    public static List<String> getPermutedStrings(String str){
        List<String> result = new ArrayList<>();
        result.add("");

        for(char ch : str.toCharArray()){
            List<String> list = new ArrayList<>();
            for(String s:result){
                for (int i = 0; i <=s.length(); i++) {
                    StringBuilder sb = new StringBuilder(s);
                    sb.insert(i,ch);
                    list.add(sb.toString());
                }
                result = list;
            }

        }

        return result;
    }
}
