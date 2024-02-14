import java.util.*;

public class que14 {
    public static void main(String...a) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        map.put(1,2);
        map.put(2,1);
        map.put(4,8);


        Set<Map.Entry<Integer,Integer>> set=map.entrySet();
        List<Map.Entry<Integer,Integer>> list=new ArrayList<Map.Entry<Integer,Integer>>(set);
        Collections.sort(list,new Sort());

        //Sort the list based on values of map

       // System.out.println(list);
        for(Map.Entry<Integer, Integer> entry:list)
            System.out.println(entry.getKey());
    }
}

class Sort implements Comparator<Map.Entry<Integer,Integer>>
{

    @Override
    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        return (o1.getValue()).compareTo(o2.getValue());
    }
}
