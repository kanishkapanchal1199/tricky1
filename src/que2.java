import java.util.IdentityHashMap;
import java.util.Map;

public class que2 {
    public static void main(String[] args) {
        Map<String,String> identityHashMap=new IdentityHashMap<String,String>();
        identityHashMap.put(new String("a"),"audi");
        identityHashMap.put(new String("a"),"ferrari");
        System.out.println(identityHashMap);
    }
}

// In case of identity hashmap it will compare it the reference of both keys and also values
//which is different so it will return both hashmap.