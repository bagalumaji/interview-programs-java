package arrays;

import java.util.HashMap;
import java.util.Map;

public class AllPairOfSums {
    public static void main(String[] args) {
        System.out.println(allPairsOfSums(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 10));
    }
    static Map<Integer,Integer> allPairsOfSums(int[]arr, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int val = target - arr[i];
            if(!map.containsKey(val) && !map.containsValue(val)){
                map.put(arr[i],val);
            }
        }
        return map;
    }
}
