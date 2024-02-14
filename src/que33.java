import java.util.HashMap;

public class que33 {

    public static void main(String[] args) {
        HashMap<Employee5, String> hm=new HashMap<Employee5, String>();
        hm.put(new Employee5("a"), "emp1");
        hm.put(new Employee5("b"), "emp2");
        hm.put(new Employee5("a"), "emp1 OVERRIDDEN");

        System.out.println("HashMap's data> "+hm);
        System.out.println("HashMap's size> "+hm.size());
        System.out.println(hm.get(new Employee5("a")));
    }
}

class Employee5 {

    private String name;

    public Employee5(String name) { // constructor
        this.name = name;
    }

    @Override
    public int hashCode(){
        return 1;
    }

    //no equals() method

    @Override
    public String toString() {
        return "Employee5[ name=" + name + "] ";
    }

}
