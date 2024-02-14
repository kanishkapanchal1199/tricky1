import java.util.*;

public class que15 {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
        map.put(4,1);
        map.put(2,6);
        map.put(5,1);

        Set<Map.Entry<Integer,Integer>> entrySet=map.entrySet();
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(entrySet);
        Collections.sort(list,new Sort1());

        for (Map.Entry<Integer,Integer> entry: list)
        {
            System.out.println(entry.getKey());
        }

        //sorted by map keys
    }
}
class Sort1 implements Comparator<Map.Entry<Integer,Integer>>
{

    @Override
    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        return (o2.getKey()).compareTo(o1.getKey());
    }
}
