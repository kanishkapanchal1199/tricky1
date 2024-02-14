import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public class que25 {
    public static void main(String[] args) {

        Map<Integer,String> conncurrentSkipListMap=new ConcurrentSkipListMap<>();
        conncurrentSkipListMap.put(11,"audi");

        Iterator<Integer> keyIterator=conncurrentSkipListMap.keySet()
                .iterator();

        while (keyIterator.hasNext())
        {
            System.out.println(keyIterator.next());
            conncurrentSkipListMap.put(13,"bmw");

        }
    }
}
