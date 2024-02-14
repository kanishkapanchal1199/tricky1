import java.util.HashMap;
import java.util.Map;

public class que29 {
    public static void main(String[] args) {
        Map<Integer,String> hashMap=new HashMap<>();
        hashMap.put(11,"a");
        hashMap.put(null,"c");
        hashMap.put(null,null);

        System.out.println(hashMap.size());
        System.out.println(hashMap);
    }
}
