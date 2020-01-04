import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapsTut {
    public static void main (String[] args){
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();  
        
        TestMap(treeMap);
    }

    public static void TestMap(Map<Integer, String> map){
        map.put(9, "cow");
        map.put(1, "ccat");
        map.put(12, "dog");
        map.put(5, "pheonix");
        map.put(0, "swam");
        map.put(33, "pigeon");
        map.put(15, "bear");

        for( Integer key: map.keySet()){
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }

    }
}