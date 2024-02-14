import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class que12 {

    public static void main(String[] args) {
        Collection<Integer> collection=new HashSet<>();
        collection.add(3);
        collection.add(1);
        collection.add(2);
        collection.add(null);

        System.out.println(collection);


        Set<Integer> treeSet=new TreeSet<Integer>();
        treeSet.addAll(collection);
        System.out.println(treeSet);
    }
}

//Treeset will not allow null values it will throw a null pointer exception.
