package strings;

import java.util.*;

public class DemoProgram {
    public static void main(String[] args) {
//        Write a program to find all subsets of a string
//        Example - FUN will be F, U, N, FU, UN, FUN.
        String str ="FUN";
        Set<String> list = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String t = str.substring(i,j+1);
                list.add(t);
            }
//            String t = str.substring(i,str.length());
//            String t1 = str.substring (0,i+1);
//            list.add(t);
//            list.add(t1);
//            list.add(str.charAt(i)+"");

        }
        System.out.println(list);
    }
}
