import java.util.*;

// comparable: natural odering
// @Override compareTo() method
class Student16 implements Comparable<Student16> {
    private String sID, sName;
    private int sAge;

    @Override
    public int compareTo(Student16 other) {
        // natural compare by name
        if (this.sName.equals(other.sName))
            return this.sID.compareTo(other.sID);
        return this.sName.compareTo(other.sName);
    }

    @Override
    public String toString() { return sID + " " + sName + " " + sAge; }

    public Student16(String sID, String sName, int sAge) {
        this.sID = sID;
        this.sName = sName;
        this.sAge = sAge;
    }

    public int getSAge() { return sAge; }
    public String getSID() { return sID; }
}

// Comparator: define multiple ways to compare
// @Override: compare()
class SortedByAge implements Comparator<Student16> {
    @Override
    public int compare(Student16 o1, Student16 o2) {
        if (o1.getSAge() == o2.getSAge()) return o1.getSID().compareTo(o2.getSID());
        return o1.getSAge() - o2.getSAge();
    }
}

public class _16_Comparable_Comparator {
    public static void main(String[] args) {
        ArrayList<Student16> al = new ArrayList<>();
        al.add(new Student16("B22DCCN243", "Phạm Văn Đức", 20));
        al.add(new Student16("B22DCCN195", "Nguyễn Đức Đạt", 20));
        al.add(new Student16("B22DCCN711", "Trương Huy Tâm", 20));
        al.add(new Student16("B23DCCN999", "Nguyễn Đức Đạt", 23));
        al.add(new Student16("B19DCCN999", "Ngô Thị Trang", 23));
        Collections.sort(al);
        System.out.println("Sorted by name: ");
        al.forEach(System.out::println);

        System.out.println("\nSorted by age: ");
        Collections.sort(al, new SortedByAge());
        al.forEach(System.out::println);
    }
}