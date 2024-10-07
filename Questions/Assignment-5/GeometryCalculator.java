class Circle {
    private double radius;

    // Constructor to set the radius of the circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle {
    private double length;
    private double width;

    // Constructor to set the dimensions of the rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double area() {
        return length * width;
    }
}

class Triangle {
    private double base;
    private double height;

    // Constructor to set the dimensions of the triangle
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Method to calculate the area of the triangle
    public double area() {
        return 0.5 * base * height;
    }
}

public class GeometryCalculator {
    public static void main(String[] args) {
        // Create instances of different shapes
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Triangle triangle = new Triangle(4.0, 5.0);

        // Calculate and display the area of the circle
        System.out.println("Area of Circle: " + circle.area());

        // Calculate and display the area of the rectangle
        System.out.println("Area of Rectangle: " + rectangle.area());

        // Calculate and display the area of the triangle
        System.out.println("Area of Triangle: " + triangle.area());
    }
}
