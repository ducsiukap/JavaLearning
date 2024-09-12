/*
 * POLYMORPHISM: Poly = many, morphism = form 
 * => many form
 * perform a single action in different ways.
 */

class myClass {
    // compile-time polymorphism: method overloading
    // some function with same name and different parameter list
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

class myClass2 extends myClass {
    // run-time polymophism: virtual function
    // method in java is virtual by default
    // use 'static' to remove virtual function
    // virtual ensure correct function to be called for that object
    @Override
    public int add(int a, int b) { return a + b + 10; }
}
public class _12_OOP_Polymorphism {
    public static void main(String[] args) {
        myClass x = new myClass();
        
        System.out.println(x.add(2, 3)); // x.add(int, int)
        System.out.println(x.add(2, 2.3)) ; // x.add(double, double)
        System.out.println(x.add(2, 3, 4)); // x.add(int, int, int) 

        myClass y = new myClass2(); // y is myClass2 obj
        System.out.println(y.add(2, 3)); // call myClass2.add(int, int) // 15
    }
}