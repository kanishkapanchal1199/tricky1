import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class que13 {

    public static void main(String[] args) {
        Map<Integer,Integer> treeMap=new TreeMap<Integer,Integer>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2.compareTo(o1);
                    }
                }
        );


        treeMap.put(4,1);
        treeMap.put(2,1);
        treeMap.put(3,1);
//sorts the elements in descending order
        System.out.println(treeMap);
    }
}
