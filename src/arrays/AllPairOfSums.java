package arrays;

import java.util.HashMap;
import java.util.Map;

public class AllPairOfSums {
    public static void main(String[] args) {
        System.out.println(allPairsOfSums(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 10));
    }
    static Map<Integer,Integer> allPairsOfSums(int[]arr, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int val : arr) {
            int diff = target - val;
            if (!map.containsKey(diff) && !map.containsValue(diff)) {
                map.put(val, diff);
            }
        }
        return map;
    }
}
