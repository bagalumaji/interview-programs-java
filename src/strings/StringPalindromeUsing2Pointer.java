package strings;

public class StringPalindromeUsing2Pointer {
    public static void main(String[] args) {
        String str = "aba";
        boolean flag=true;
        int start=0;
        int end = str.length()-1;
        while(start<end){
            if (str.charAt(start) != str.charAt(end)) {
                flag = false;
                break;
            }
            start++;
            end--;
        }
        if (flag)
            System.out.println(str+" is palindrome");
        else
            System.out.println(str+" is not palindrome");
    }
}
