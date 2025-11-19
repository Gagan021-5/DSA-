import java.util.*;

public class prorityqueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);

        for (int i = 0; i <= pq.size(); i++) {
            System.out.println(pq.poll());
        }
    }
}
