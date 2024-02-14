import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class que8 {
    public static void main(String[] args) {
        Employee1 emp1=new Employee1("sam","4");
        Employee1 emp2=new Employee1("amy","2");
        Employee1 emp3=new Employee1("aeron","2");
        ArrayList<Employee1> list=new ArrayList<Employee1>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        //compare method of Comparator has been implemented properly and
        // will sort Employee class on basis of name in descending order.
        Collections.sort(list,new Employee1());
        System.out.println(list);
    }
}
class Employee1 implements Comparator<Employee1> {
    String name;
    String id;

    public Employee1() {}

    public Employee1(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compare(Employee1 obj1, Employee1 obj2) {
        return obj2.name.compareTo(obj1.name);
    }

    @Override
    public String toString() {
        return "{" + "name=" + name + ", id=" + id  + '}';
    }
}
