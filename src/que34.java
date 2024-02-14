import java.util.HashMap;

public class que34 {

    public static void main(String[] args) {
        HashMap<Employee6, String> hm=new HashMap<Employee6, String>();
        hm.put(new Employee6("a"), "emp1");
        hm.put(new Employee6("b"), "emp2");
        hm.put(new Employee6("a"), "emp1 OVERRIDDEN");

        System.out.println("HashMap's data> "+hm);
        System.out.println("HashMap's size> "+hm.size());
        System.out.println(hm.get(new Employee6("a")));
    }
}

class Employee6 {

    private String name;

    public Employee6(String name) { // constructor
        this.name = name;
    }

    //no hashCode() method

    @Override
    public boolean equals(Object obj){
        Employee6 emp=(Employee6)obj;
        return (emp.name==this.name || emp.name.equals(this.name));
    }

    @Override
    public String toString() {
        return "Employee6[ name=" + name + "] ";
    }

}
