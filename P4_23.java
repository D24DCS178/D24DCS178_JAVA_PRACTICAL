/*Assume you want to capture shapes, which can be either
circles (with a radius and a color) or rectangles (with a
length, width, and color). You also want to be able to
create signs (to post in the campus center, for example),
each of which has a shape (for the background of the sign)
and the text (a String) to put on the sign. Create classes
and interfaces for circles, rectangles, shapes, and signs.
Write a program that illustrates the significance of
interface default method. */

interface Shape {
    String getColor();
    void setColor(String color);
    double getArea();
    default void printShape() {
        System.out.println("Shape: " + getColor());
    }
}

class Circle implements Shape {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printShape() {
        System.out.println("Circle: radius=" + radius + ", color=" + color);
    }
}

class Rectangle implements Shape {
    double length;
    double width;
    String color;

    Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return length * width;
    }

    @Override
    public void printShape() {
        System.out.println("Rectangle: length=" + length + ", width=" + width + ", color=" + color);
    }
}

// Define the Sign class
class Sign {
    Shape shape;
    String text;

    Sign(Shape shape, String text) {
        this.shape = shape;
        this.text = text;
    }

    Shape getShape() {
        return shape;
    }

    String getText() {
        return text;
    }

    void printSign() {
        shape.printShape();
        System.out.println("Text: " + text);
    }
}

public class P4_23 {
    public static void main(String[] args) {
        // Create a Circle object
        Circle circle = new Circle(5.0, "Red");
        circle.printShape();

        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Blue");
        rectangle.printShape();

        // Create a Sign object with a Circle shape
        Sign circleSign = new Sign(circle, "Welcome to Campus!");
        circleSign.printSign();

        // Create a Sign object with a Rectangle shape
        Sign rectangleSign = new Sign(rectangle, "Campus Events");
        rectangleSign.printSign();
    }
}