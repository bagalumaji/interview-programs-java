package strings;

import java.util.Arrays;

public final class ReverseStringPreservingNumber {
    public static void main(String[] args) {
        String str = "ab31cd51ef";
        char [] chars = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        int cnt=0;
        while (start < end) {
            if (Character.isDigit(chars[start])) {
                start++;
            }
            if (Character.isDigit(chars[end])) {
                end--;
            }
            if (!Character.isDigit(chars[start]) && !Character.isDigit(chars[end])) {
                   char ch = chars[start];
                   chars[start] = chars[end];
                   chars[end] = ch;
                   start++;
                   end--;
            }
            cnt++;
        }
        System.out.println("cnt = " + cnt);
        System.out.println("str = " + str);
        System.out.println("str = " + new String(chars));
    }
}
