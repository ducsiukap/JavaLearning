// the key different with abstract class: 
// by using 'interface', we can achieve fully abstraction

// declare a interface with 'interface' keyword
interface Shape {
    public double area(); 
}

class Circle implements Shape {
    private double radious;
    public Circle() { this.radious = 0; }
    public Circle(double radious) { this.radious = radious; }

    // redefined area() method
    public double area() {return 3.14 * this.radious * this.radious; }
}

class Triangle implements Shape {
    private double edge1, edge2, edge3;
    public Triangle() {this.edge1 = this.edge2 = this.edge3 = 0; }
    public Triangle(double edge1, double edge2, double edge3) {
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }

    // redefined area() method
    public double area() {
        double p = (this.edge1 + this.edge2 + this.edge3) / 2;
        return Math.sqrt(p * (p - this.edge1) * (p - this.edge2) * (p - this.edge3));
    }
}

class Rectangle implements Shape {
    private double width, height;
    public Rectangle() { this.width = this.height = 0; }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() { return this.width; }
    
    // redefined area() method
    public double area() { return width * height; }
}

class Square extends Rectangle {
    public Square() { super(); }
    public Square(double width) { super(width, 0); }
    
    // redefined area() method
    public double area() { return this.getWidth() * this.getWidth(); }
}

public class _10_OOP_Interface {
    public static void main(String[] args) {
        Square sq = new Square(3);
        System.out.printf("Square area: %.2f\n", sq.area());
        
        Circle c = new Circle(2.5);
        System.out.printf("Circle area: %.2f\n", c.area());

        Triangle tg = new Triangle(3, 4, 5);
        System.out.printf("Triangle area: %.2f\n", tg.area());
    }
}