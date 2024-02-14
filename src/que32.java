import java.util.Hashtable;
import java.util.Map;

public class que32 {

    public static void main(String[] args) {
        Map<Integer,String > hashtable= new Hashtable<Integer,String>();

        hashtable.put(11,"a");
        hashtable.put(null,"c");
        hashtable.put(null,null);
        //hashtable does not allows to store null key or values.

        System.out.println(hashtable.size());
        System.out.println(hashtable);
    }
}
