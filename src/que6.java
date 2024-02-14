import java.util.LinkedHashSet;
import java.util.Set;

public class que6 {

    public static void main(String[] args) {
        Set s=new LinkedHashSet();
        s.add("1");
        s.add(1);
        s.add(3);
        s.add(2);

        System.out.println(s);

    }
}
//LinkedHashSet maintains insertion order and does not allow duplicates.
//in case of this output will be [1,1,3,2] as first "1" is String so it allowed