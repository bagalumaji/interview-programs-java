package strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberOfSubstringsWithOnly1s {
    public static void main(String[] args) {
        String s = "111111";
        System.out.println(getSubStringCount(s));
    }

    public static int getSubStringCount(String str) {

        List<String> stringList = Arrays.stream(str.split("0")).filter(e -> !e.isBlank()).collect(Collectors.toList());
        int finalSum = 0;
        System.out.println("stringList = " + stringList);
        int sum = 0;
        if (stringList.size() == 1) {
            finalSum = getCount(stringList.get(0));
        } else {
            for (int i = 0; i < stringList.size(); i++) {
                if (stringList.get(i).length() > 1) {
                    sum += stringList.get(i).length();
                    if (i < stringList.size() - 1) {
                        sum += getCount(stringList.get(i), stringList.get(i + 1));
                    }
                } else {
                    finalSum++;
                }

            }
            if (finalSum != 0)
                finalSum += sum;
            else
                finalSum += sum + 1;
        }
        return finalSum;
    }

    private static int getCount(String src, String str) {
        int len = src.length();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            int l = i + len;
            if (str.length() >= l && str.substring(i, l).equals(src))
                sum++;
        }
        return sum + 1;
    }

    private static int getCount(String str) {
        int sum = str.length();

        for (int i = 0; i < str.length(); i++) {
            sum += getCount(str.substring(0, i + 1), str.substring(i + 1));
            System.out.println("sum = " + sum);
        }
        return sum;
    }

}
