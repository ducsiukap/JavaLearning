import java.util.*;

public class _17_JavaIterator {
    public static void main(String[] args) {
        LinkedList<Integer> llist = new LinkedList<>();
        llist.add(12);
        llist.add(42);
        llist.add(33);
        llist.add(14);
        llist.add(25);

        // iterator
        Iterator itr = llist.iterator();
        System.out.println("Iterator:");
        while (itr.hasNext()) {
            int element = (Integer)itr.next();
            System.out.print(element + " ");
            if (element == 14) itr.remove();
        }
        System.out.printf("\n%s\n", llist);

        // enumeration
        // like iterator but not support remove
        // for vector, hashtable
        Vector<Integer> v = new Vector<>();
        v.add(12);
        v.add(42);
        Enumeration e = v.elements();
        // hasMoreElements() and nextElement()

        //ListIterator
        ListIterator litr = llist.listIterator();
        // add "Previous", "Index", add() before current element, set() current element
        System.out.println(litr.nextIndex()); // previousIndex
        System.out.print("\nNext: ");
        while (litr.hasNext())
            System.out.print(litr.next() + " ");
        System.out.print("\nPrevious: ");
        while (litr.hasPrevious())
            System.out.print(litr.previous() + " ");
        System.out.println();

        litr.set(27); // litr->27 42 33 25
        litr.add(30); // 30 litr->27 42 33 25
        litr.previous(); // litr->30 27 42 33 25
        while (litr.hasNext())
            System.out.print(litr.next() + " ");
    }
}
