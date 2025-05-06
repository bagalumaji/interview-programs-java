import java.util.*;
public class NonRepeatingCharcters{

    public static void main(String[]args){
        System.out.println(nonRepeatingCharacters("zsstddce"));
    }
    private static String nonRepeatingCharacters(String str) {
        Map<Character,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry entry: map.entrySet()){
            if((int)entry.getValue()==1){
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}