import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class que9 {
    public static void main(String[] args) {
        Employee2 emp1=new Employee2("sam","4");
        Employee2 emp2=new Employee2("amy","2");
        Employee2 emp3=new Employee2("aeron","2");
        ArrayList<Employee2> list=new ArrayList<Employee2>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        //compare method of Comparator has been implemented properly and
        // will sort Employee class on basis of name in Ascending order.
        Collections.sort(list,new Employee2());
        System.out.println(list);
    }
}
class Employee2 implements Comparator<Employee2> {
    String name;
    String id;

    public Employee2() {}

    public Employee2(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compare(Employee2 obj1, Employee2 obj2) {
        return obj1.name.compareTo(obj2.name);
    }

    @Override
    public String toString() {
        return "{" + "name=" + name + ", id=" + id  + '}';
    }
}
