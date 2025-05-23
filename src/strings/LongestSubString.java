package strings;

import java.util.HashSet;

public class LongestSubString {
    public static void main(String[] args) {
        String str = "bcadeffre";
        System.out.println(getLongestSubString(str));
    }

    static int getLongestSubString(String str) {
        int start = 0;
        int end = 0;
        int max = 0;
        String result = "";
        HashSet<Character> characters = new HashSet<>();

        while (end != str.length()) {
            if (!characters.contains(str.charAt(end))) {
                characters.add(str.charAt(end));
                end++;
                if (max < characters.size()) {
                    max = characters.size();
                    result = str.substring(start, end);
                }
            } else {
                characters.remove(str.charAt(start));
                start++;
            }
        }
        System.out.println(result);
        return result.length();

    }
}
