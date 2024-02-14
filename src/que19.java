import java.util.ArrayList;
import java.util.List;

public class que19 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        System.out.println(sum(list));

        //List<? super Number> can accept List<Integer>,
        // it can accept list of anySubClassOfNumber i.e. List<Double>, List<Float>, etc.
    }
    public static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }
}
