import java.util.ArrayList;
import java.util.List;

public class que35 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("a");
        list.clear();
        list.add("b");
        list.add("b");
        System.out.println(list.size());

    }
}
