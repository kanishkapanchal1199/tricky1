import java.util.ArrayList;
import java.util.List;

public class que20 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        //program will not compile as method has List<Number>
        // and here we are passing List<Integer>.
        list.add(2);
        list.add(3);
       // m(list);
    }

    public static void m(List<Number> list) {
        System.out.println(list);
    }
}
