import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class que11 {

    public static void main(String[] args) {
        Collection<Integer> collection=new HashSet<Integer>();
        collection.add(3);
        collection.add(10);
        collection.add(1);
        collection.add(2);


        Set<Integer> treeSet=new TreeSet<>(collection);

        System.out.println(treeSet);
    }
}
