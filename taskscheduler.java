import java.util.*;

// You are given an array of CPU tasks, each labeled with a letter from A to Z, and a number n. 
// Each CPU interval can be idle or allow the completion of one task. 
// Tasks can be completed in any order, but there's a constraint: there has to be a gap of at least n intervals between two tasks with the same label.

// Return the minimum number of CPU intervals required to complete all tasks.

// Example 1:
// Input: tasks = ["A","A","A","B","B","B"], n = 2
// Output: 8

// Explanation: A possible sequence is: A -> B -> idle -> A -> B -> idle -> A -> B.

// After completing task A, you must wait two intervals before doing A again. The same applies to task B. In the 3rd interval, neither A nor B can be done, so you idle. By the 4th interval, you can do A again as 2 intervals have passed.
public class taskscheduler {

    public static void main(String[] args) {
      char c = 'A';
      System.out.println(c - 100);
    }

    public static int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (char t : tasks) {
            hmap.put(t, hmap.getOrDefault(t, 0) + 1);
        }

        pq.addAll(hmap.values());

        int time = 0;
        Queue<Task> queue = new LinkedList<>();

        while (!pq.isEmpty() || !queue.isEmpty()) {
            if (!pq.isEmpty()) {
                int cnt = pq.poll();
                if (cnt > 1) {
                    queue.add(new Task(cnt - 1, time + n));
                }
            }

            if (!queue.isEmpty() && queue.peek().nextavail <= time) {
             Task task = queue.poll();
             pq.add(task.cnt);

            }
            time ++;
        }

        return time;

    }

    static class Task {
        int cnt = 0;
        int nextavail = 0;

        Task(int count, int nextavail) {
            this.cnt = count;
            this.nextavail = nextavail;
        }
    }
}
