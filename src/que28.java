import java.util.HashMap;

public class que28 {

    public static void main(String[] args) {
        HashMap<Employee4, String> hm=new HashMap<Employee4, String>();
        hm.put(new Employee4("a"), "emp1");
        hm.put(new Employee4("b"), "emp2");
        hm.put(new Employee4("a"), "emp1 OVERRIDDEN");

        System.out.println("HashMap's data> "+hm);

        //As hashcode method is implemented 2 bucket locations will be used.
        System.out.println("HashMap's size> "+hm.size());
        //returns 2 as size as 2 data is returned.
        System.out.println(hm.get(new Employee4("a")));

    }
}

class Employee4 {

    private String name;

    public Employee4(String name) { // constructor
        this.name = name;
    }

    @Override
    public int hashCode(){
        return (this.name==null ? 0: this.name.hashCode() );
    }

    @Override
    public boolean equals(Object obj){
        Employee4 emp=(Employee4)obj;
        return (emp.name==this.name || emp.name.equals(this.name));
    }

    @Override
    public String toString() {
        return "Employee4[ name=" + name + "] ";
    }

}
