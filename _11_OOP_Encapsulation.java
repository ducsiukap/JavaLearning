// Encapsulation: restrict direct access to data or variable, 
// hind the data, variable and
// provide getter and setter method() to access them

class Student {
    // make data as private
    // can only access within this class
    private String name, ID;
    private int age;

    public Student() {
        this.name = "unknown";
        this.ID = "unknown";
        this.age = 0;
    }

    public Student(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    // provide public setter and getter 
    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public String getID() { return this.ID; }

    public void setID(String iD) { this.ID = iD; }

    public int getAge() { return this.age; }

    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return ("Student name: " + this.name + "\n" +
                "Student ID  : " + this.ID + '\n' + 
                "Student Age : " + this.age + '\n' +
                "-------------------------"); 
    }
}

public class _11_OOP_Encapsulation{
    public static void main(String[] args) {
        Student s = new Student(); // creating new student 
        s.setName("ducsjukap"); // accessing to s.name
        s.setID("B22DCCNXXX"); // accessing to s.ID
        s.setAge(20); // accessing to s.age
        System.out.println(s.toString());
    }
}