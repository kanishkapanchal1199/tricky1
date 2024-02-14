import java.util.ArrayList;
import java.util.Collections;

public class que7 {
    public static void main(String[] args) {
        Employee emp1=new Employee("sam","4");
        Employee emp2=new Employee("amy","2");
        Employee emp3=new Employee("aeron","2");

        ArrayList<Employee> list=new ArrayList<Employee>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        Collections.sort(list);//compare the name based on ascending order.
        System.out.println(list);
    }
}
class Employee implements Comparable<Employee>
{
    String name;
    String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Employee o) {
       return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}