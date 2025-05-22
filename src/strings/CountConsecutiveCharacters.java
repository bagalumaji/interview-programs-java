package strings;

public class CountConsecutiveCharacters {
    public static void main(String[] args) {
        String str="yyyttyyyiio";
        System.out.println(getCountConsecutiveCharacters(str));
    }
    static String getCountConsecutiveCharacters(String str){
        int cnt=1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <=str.length(); i++) {
            if(i<str.length() && str.charAt(i)==str.charAt(i-1)){
                cnt++;
            }else {
                sb.append(str.charAt(i-1)).append(":").append(cnt).append(" ");
                cnt=1;
            }
        }
        return sb.toString();
    }
}
