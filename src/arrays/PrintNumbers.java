package arrays;

public class PrintNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int[] arr = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        for (int i = 2; i < arr.length; i++) {
            if (arr[i - 2] + 1 == arr[i - 1] && arr[i] == arr[i - 1] + 1) {
                System.out.println(arr[i - 2] + " " + arr[i - 1] + " " + arr[i]);
            }
        }
    }
}
