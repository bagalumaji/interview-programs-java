package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class StoreInGroupFromString {
    public static void main(String[] args) {
        String [] arr = {"apple","bat","banana","cat","dog","orange"};
        Map<Integer, List<String>> map = new HashMap<>();
        for(String str: arr){
            int l = str.length();
            List<String> lst =map.getOrDefault(l,new ArrayList<>());
            lst.add(str);
            map.put(l,lst);
        }
        System.out.println("map = " + map);
    }
}
