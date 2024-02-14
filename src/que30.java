import java.util.Iterator;
import java.util.Vector;

public class que30 {

    public static void main(String[] args) {
        Vector<String> vector=new Vector<String>();

        vector.add("1");
        vector.add("2");

        Iterator<String> iterator=vector.iterator();
        while (iterator.hasNext())
        {
            vector.add("3");
            System.out.println(iterator.next());
        }
    }
}

//ConcurrentModificationException is going to be
//thrown as vector is fail-fast iterator
