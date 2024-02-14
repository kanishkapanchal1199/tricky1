import java.util.Map;
import java.util.TreeMap;

public class que3 {

    public static void main(String[] args) {
        Map<Integer,String> m=new TreeMap<>();
        m.put(11,"audi");
        m.put(null,null);
        m.put(11,"bmw");
        m.put(null,"fer");

        System.out.println(m.size());

        System.out.println(m);
    }
}

//NullPointerException at line 9
//TreeMap does not any null key or null value.