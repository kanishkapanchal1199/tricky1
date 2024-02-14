public class que18 {
    public static void main(String[] args) {
        Abc o = new Abc();

        Integer i[] = { 1, 2 };
        o.display(i);

        Double d[] = { 1.1, 2.2 };
        o.display(d);

    }
}

class Abc {
    <t> void display(t obj[]) {
        for (t i : obj) {
            System.out.print(i + "  ");
        }
    }
}
//because t can of any type may be Integer or double