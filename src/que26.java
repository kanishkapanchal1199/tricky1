import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class que26 {

    public static void main(String[] args) {
        List<String> copyOnWriteArrayList =new CopyOnWriteArrayList<>();

        copyOnWriteArrayList.add("ind");
        copyOnWriteArrayList.add("usa");
        copyOnWriteArrayList.add(null);

        for (String string:copyOnWriteArrayList)
        {
            System.out.print(string +" ");
            copyOnWriteArrayList.add("newEle3");
        }
    }

   // CopyOnWriteArrayList allows to add null, maintains insertion order
    // and iteration is fail-safe.
}
