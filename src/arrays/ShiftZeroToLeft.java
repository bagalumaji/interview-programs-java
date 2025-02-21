package arrays;

public final class ShiftZeroToLeft {
    public static void main(String[] args) {
        int [] arr = {34,0,9,5,0,7,4,0,4,0,23};
        int start=0;
        int end = arr.length-1;
        while(start<end){
            if(arr[start] == 0){
                start++;
            }
            if(arr[end]!=0){
                end--;
            }
            if(arr[start]!=0 && arr[end]==0){
                int t = arr[start];
                arr[start] = arr[end];
                arr[end] = t;
                start++;
                end--;
            }

        }
        for (int j : arr) {
            System.out.print(" " + j);
        }

    }
}
