import java.util.HashMap;
import java.util.Map;

public class HashMapTut {
    public static void main (String[] args){
        HashMap<Integer,String> map = new HashMap<Integer,String>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(5, "five");
        map.put(10, "ten");
        

        String text = map.get(5);

        System.out.println(text);

        for(Map.Entry<Integer,String> entry: map.entrySet()){
            Integer key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + ": " + value);
        }
    }
}