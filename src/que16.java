import java.util.ArrayList;
import java.util.List;

public class que16 {
    public static void main(String[] args) {
        List<Number> numberList=new ArrayList<>();
        numberList.add(2);
        numberList.add(3);
        m(numberList);
    }
    static void  m(List<? super Double> l)
    {
        System.out.println(l.get(0));
        System.out.println(l.get(1));
    }
}
