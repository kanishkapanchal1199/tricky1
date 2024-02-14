import java.util.HashMap;

public class que27 {

    public static void main(String[] args) {
        HashMap<Employee3, String> hm=new HashMap<Employee3, String>();
        hm.put(new Employee3("a"), "emp1");
        hm.put(new Employee3("b"), "emp2");
        hm.put(new Employee3("a"), "emp1 OVERRIDDEN");

        System.out.println("HashMap's data> "+hm);
        //As hashCode() method is not there, hashcode generated
        // for 3 objects will be different and we will end up using 3 buckets.
        System.out.println("HashMap's size> "+hm.size());

        //As equals() method is not their, size will be 3.
        System.out.println(hm.get(new Employee3("a")));

        //we won’t be able to get object.
    }
}
class Employee3 {

    private String name;

    public Employee3(String name) { // constructor
        this.name = name;
    }


    //no hashCode() method

    //no equals() method

    @Override
    public String toString() {
        return "Employee[ name=" + name + "] ";
    }

}
