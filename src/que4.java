import java.util.Arrays;
import java.util.Comparator;

public class que4 {

    public static void main(String[] args) {
        String [] ar={"c","d","b","a","e"};
        NestedClass in=new NestedClass();
        Arrays.sort(ar,in);
        for(String str:ar)
        {
            System.out.print(str + " ");
        }
        System.out.println(Arrays.binarySearch(ar, "b"));

    }
    static class NestedClass implements Comparator<String> {
        public int compare(String s1, String s2) {
            return s2.compareTo(s1);// to sort in descending order
            //return s1.compareTo(s2);//to sort in ascending order
        }
    }
}
