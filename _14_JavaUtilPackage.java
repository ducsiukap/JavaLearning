import java.util.*;
import java.text.SimpleDateFormat;

public class _14_JavaUtilPackage {
    public static void main(String[] args) {
        // ArayyList<Type>, Arrays
        ArrayList<Integer> al = new ArrayList<>();

        // BitSet
        BitSet x = new BitSet(8);

        // Date - time from 1.1.1970 00:00:00 GMT
        // default format: MM/dd/yyyy
        Date d = new Date("03/13/2004"), d2 = new Date();
//        // time from Mar 13th 2004 to now
//        System.out.println((d2.getTime() - d.getTime()) / (24 * 60 * 60 * 1000));
//        System.out.println(d);
//        System.out.println(d.compareTo(d2));

        // Map<K, V>
//        // HashMap<>() -> allow null key and null value, unordered
//        // LinkedHashMap<>() -> maintaining based on insertion order
//        // TreeMap<>() -> red-black tree, sorted by key
//        Map<String, String> mp = new HashMap<>();
//        // mp.put(K, V), mp.get(k), mp.remove(k)
//        // mp.containKey(k), mp.containValue(V) } -> boolean
//        // mp.size(), mp.keySet(), mp.values(), mp.entrySet()

        // Set<Type>
//        // HashSet<>() -> unordered
//        // TreeSet<>() -> ordered
//        // LinkedHashSet<>()
//        Set<Integer> set = new HashSet<>();
//        // set.add(), set.remove(), s.constains()
//        // s.size(), s.isEmpty(), s.clear()
//        // s.iterator()

        // Random
        Random r = new Random();
        System.out.println("Random Integer number in [1, 100] : " + (Math.abs(r.nextInt()) % 100 + 1));
        // r.nextDouble(), r.nextFloat() -> in [0.0, 1.0]

        // LinkedList<Type> -> for List and Deque
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 1; i < 11; ++i) ll.add(r.nextInt(100));
        System.out.println("LinkedList: " + ll);
        // add([idx], e), addFirst(e), addLast(e)
        // get(idx), peekFirst(), peekLast()
        // remove(idx), removeFirst(), removeLast()
        // size()

        // Queue<>(), PriorityQueue<>()
        // Queue<Integer> q = new LinkedList<>();
        // Deque<Integer> dq = new ArrayDeque<>();
        System.out.print("Deque: ");
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // sorted
        for (int i = 0; i < 5; ++i) pq.add(r.nextInt(100));
        // pq.add(e) or pq.offer(e)
        while (!pq.isEmpty())
            System.out.print(pq.remove() + " ");
            // or pq.pull()
        System.out.println();
        // pq.peek() or pq.element() -> top of queue
        // recommend offer(), pull() and peek()

        // Stack
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < 5; ++i) st.push(r.nextInt(100));
        System.out.println("Stack: " + st);
        while (!st.isEmpty()) st.pop();
        // st.peek() -> get top

        // Scanner()
        // Timer()
        // StringTokenizer()
        // StringJoiner()
    }
}
