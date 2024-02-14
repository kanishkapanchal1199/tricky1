import java.util.HashMap;
import java.util.Map;

public class que1 {
    public static void main(String[] args) {
        Map<String,String>  hashmap=new HashMap<String,String>();
        hashmap.put(new String("a"),"audi");
        hashmap.put(new String("a"),"ferrari");
        System.out.printf(hashmap.toString());
    }
}

//hashmap does not allow duplicate keys. so it will override the value for the same key to last.
