/* Abstraction: only show the essential details or method for use
Simple Example to understand Abstraction:
Television remote control is an excellent example of abstraction. 
It simplifies the interaction with a TV 
by hiding the complexity behind simple buttons and symbols, 
making it easy without needing to understand the technical details of how the TV functions. 
 */

// abstract class : a generalization form of any animal
abstract class Animal {
    private String name;

    public Animal(String name) { this.name = name; }
    public Animal() { this.name = "unknown"; }

    public String getName() { return this.name;}

    // abstract method 
    // declared without implementation
    public abstract void makeSound();
}


class Cat extends Animal {
    public Cat(String name) { super(name);}

    // abstract method must be redefined in subclass
    public  void makeSound() { System.out.println(this.getName() + " " + "meow meow!"); }
}

class Dog extends Animal {
    public Dog(String name) { super(name); }
    
    // abstract method must be redefined in subclass
    public void makeSound() { System.out.println(this.getName() + " " + "gau gau!"); }
}

public class _09_OOP_Abstraction {
    public static void main(String[] args) {
        Animal Bily = new Dog("Bily");
        Bily.makeSound();

        Animal Meo = new Cat("Meo Meo");
        Meo.makeSound();
    }
}