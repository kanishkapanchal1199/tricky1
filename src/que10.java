import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class que10 {
    public static void main(String[] args) {
        Set<Integer> treeSet=new TreeSet<Integer>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2.compareTo(o1);
                    }
                }
        );
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(2);//sorts the treeset values in descending order.

        System.out.println(treeSet);
    }
}
