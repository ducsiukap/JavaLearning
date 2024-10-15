import java.util.*;

/*
ArrayList Class \                                  /  TreeSet
Vector Class ---- List -----> Collection <---- Set <--- HashSet, LinkedHashSet
Stack Class ----//           /      |
LinkedList Class/           /       -------------------------Map <---- HashMap, LinkedHashMap
                           /                                  |-------TreeMap
                        Queue <---- PriorityQueue Class
                          |
                       Dequeue <----- ArrayQueue

- Shared method:
    + add(e), clear(), remove(idx)
    + constain(), equals(), isEmpty()
    + max(), size(), toArray()
- Collection method: addAll(Collection), removeAll(collection), constainAll(Collection)
- iterator()
 */

public class _15_CollectionFramework {
    static Random rand = new Random();
    public static void main(String[] args) {
        // Collection<Type> interface
        Collection<Integer> c = new ArrayList<>();
        for (int i = 0; i < 5; ++i) c.add(rand.nextInt(10));
        System.out.println("Collection: " + c);

        // List<Type> interface
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; ++i) list.add(rand.nextInt(10));
        System.out.println("\nList: " + list);

//        c.addAll(list);
//        System.out.println(c.containsAll(list)); // true

        // Queue Interface
        Queue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < 5; ++i) q.add(rand.nextInt(10));
        System.out.print("\nPriorityQueue: ");
        while (!q.isEmpty())
            System.out.print(q.poll() + " ");
        System.out.println();

        // Dequeue Interface:
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < 5; ++i) dq.add(rand.nextInt(10));
        System.out.println("\nDequeue: ");
        while (!dq.isEmpty())
            System.out.printf("pollFirst: %d, pollLast: %d\n", dq.pollFirst(), dq.pollLast());
        System.out.println("Empty deque!");

        // Set interface:
        Set<Integer> set = new TreeSet<>(); // odered set
        for (int i = 0; i < 5; ++i) set.add(rand.nextInt(10));
        System.out.println("\nTreeSet: " + set);

        // Map Interface
        Map<Integer, String> map = new HashMap<>(); // unodered map
        for (int i = 0; i < 5; ++i) map.put(rand.nextInt(10), " vduczz!");
        System.out.println("HashMap: " + map);
    }
}
