package strings;

public class ReverseStringWithCondition {
    public static void main(String[] args) {
        String str = "sharu bagal pandharpur";
        //output - urahs aga ruprahdnap
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) {
                sb.append(ReverseString.reverseString(words[i])).append(" ");
            } else {
                sb.append(words[i], 1, words[i].length() - 1).append(" ");
            }
        }
        System.out.println(sb);
    }
}
