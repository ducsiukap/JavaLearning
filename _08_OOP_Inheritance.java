/*
 * Inheritance: create a class based on an existing class
 * ex: Dog class is created base on Animal class
 * Why use?
 * - code reusability (like function)
 * - method overloading
 */

class Vehicle {
    protected String name, ID, brand;
    protected int wheel;
    public Vehicle() {
        this.name = "";
        this.ID = "";
        this.brand = "";
        this.wheel = 0;
    }
    // setter
    public String getName() { return this.name;}
    public String getBrand() { return this.brand;}
    public String getID() { return this.ID;}
    public int getWheel() { return this.wheel;}

    //getter
    public void setName(String name) { this.name = name;}
    public void setID(String ID) { this.ID = ID;}
    public void setBrand(String brand) { this.brand = brand;}
    public void setWheel(int wheel) { this.wheel = wheel;}


    // a method that is initialized with "final" keyword can't be overriden in subclass
    // final protected void printInfor() {} // can't be overriden in MotoBike and Car class
    protected void printInfor() { // can be overriden
        System.out.println("-------------------");
        System.out.println("Type of vehicle: " + this.getClass().getName());
        System.out.println("Brand : " + this.brand);
        System.out.println("Name  : " + this.name);
        System.out.println("ID    : " + this.ID);
    }    

    // a method that is initialized with "static" keyword will shadow its in subclass
    static protected void staticMethod() { System.out.println("im come from vehicle class");}
}

// syntax : class subClass extends superClass {}
class MotoBike extends Vehicle {
    private int cc; // Cylinder capacity
    
    public MotoBike(String name, String brand, String ID, int cc) {
        this.name = name;
        this.brand = brand;
        this.ID = ID;
        this.cc = cc;
    }

    static public void staticMethod() { System.out.println("im come from MotoBike class");}

    // method override
    @Override 
    public void printInfor() {
        super.printInfor();
        System.out.println("Cycliner Capacity: " + cc + "cc");
    }

    public void setCC(int cc) {this.cc = cc;}
    public int getCC() {return this.cc;}
}

class Car extends Vehicle {
    private int seats;

    public Car(String name, String brand, String ID, int seats) {
        this.name = name;
        this.brand = brand;
        this.ID = ID;
        this.seats = seats;
    }

    static public void staticMethod() { System.out.println("im come from Car class");}

    @Override
    public void printInfor() {
        super.printInfor();
        System.out.println("Number of seats: " + this.seats);
    }

    public void setCC(int seats) {this.seats = seats;}
    public int getCC() {return this.seats;}
}

public class _08_OOP_Inheritance {
    public static void main(String[] args) {
        Vehicle mb = new MotoBike("Wave Alpha", "Honda", "29V1-61XXX", 100);
        mb.printInfor(); // MotoBike.printInfor()

        Vehicle car = new Car("GLC 300", "Mercedes", "30K-9999", 4);
        car.printInfor(); // Car.printInfor()

        // sell to other =)))
        car.setID("29V1-61XXX");
        car.printInfor(); // Car.printInfor()

        // car.staticMethod(); // Vehicle.staticMethod()
        // Car carObj = new Car(null, null, null, 0);
        // carObj.staticMethod(); // Car.staticMethod()
    }
}
