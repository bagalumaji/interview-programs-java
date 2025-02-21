package strings;

public final class PrintNumbersFromString {
    public static void main(String[] args) {
        String str ="abc1rf5ed6j3x";
        printNumbers(str);
    }
    static void printNumbers(final String str){
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                System.out.println("ch = " + ch);
            }
        }
    }
}
