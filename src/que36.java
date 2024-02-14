import java.util.HashSet;
import java.util.Set;

public class que36 {
    public static void main(String[] args) {
        Set hashSet=new HashSet();

        hashSet.add("1");
        hashSet.add(1);
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add("null");
        System.out.println(hashSet);
    }
}
