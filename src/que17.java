import java.util.ArrayList;
import java.util.List;

public class que17 {

    public static void main(String[] args) {
        List<Integer> numberList=new ArrayList<>();
        numberList.add(2);
        numberList.add(3);
       // m(numberList);
    }
    static void  m(List<? super Double> l)
    {
        System.out.println(l.get(0));
        System.out.println(l.get(1));
    }
}

//this will not work as Integer is not superclass of Double.