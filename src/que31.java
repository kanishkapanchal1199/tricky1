import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class que31 {

    public static void main(String[] args) {
        Map<Integer,String> hashMap=new HashMap<Integer,String>();
        hashMap.put(11, "a");
        Collections.unmodifiableMap(hashMap);
        //hashMap=Collections.unmodifiableMap(hashMap); //this will throw an error
        //here unmodifableMap is not referenced anywhere so  it will be able to store
        //the new value even if after using unmodifiableMap
        hashMap.put(12, "b");
        System.out.println(hashMap);
    }
}
