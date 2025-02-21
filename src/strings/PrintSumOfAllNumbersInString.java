package strings;

public final class PrintSumOfAllNumbersInString {
    private PrintSumOfAllNumbersInString() {
    }

    public static void main(String[] args) {
        String str = "abc1rf15ed60j3x";
        printSum(str);
    }

    static void printSum(String str) {
        int sum = 0;
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                num = num * 10 + (ch - '0');
            } else {
                sum += num;
                num = 0;
            }
        }
        System.out.println("sum = " + sum);
    }
}
