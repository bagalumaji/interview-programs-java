package arrays;

public class SecondMinimumFromArray {
    public static void main(String[] args) {
        System.out.println(secondMinimumNumber(new int[]{2, 1, 0, 4, 3, 6, 5,-1}));
    }
    static int secondMinimumNumber(int []arr){
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int val : arr){
            if(min1>val){
                min2 = min1;
                min1 = val;
            }else if(min2>val && min1!=val){
                min2 = val;
            }
        }
        return min2;
    }
}
