package general;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }
    static boolean isPalindrome(int x){
        int rev=0;
        int y=x;
        if(x<0)
                return false;

        while (x!=0){
            int d = x%10;
            x = x/10;
            rev = rev*10+d;
        }

        return rev == y;
    }
}
