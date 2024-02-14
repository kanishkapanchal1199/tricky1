import java.util.PriorityQueue;

public class que22 {

    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.offer(4));
        q.add(1);
        q.remove(2);
        System.out.println(q.peek());
        System.out.println(q);
    }
}
