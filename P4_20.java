/*Create a class named 'Shape' with a method to print "This
is This is shape". Then create two other classes named
'Rectangle', 'Circle' inheriting the Shape class, both
having a method to print "This is rectangular shape" and
"This is circular shape" respectively. Create a subclass
'Square' of 'Rectangle' having a method to print "Square
is a rectangle". Now call the method of 'Shape' and
'Rectangle' class by the object of 'Square' class*/

class Shape {
    void methodShape()
    {
        System.out.println("This is shape.");
    }
}

class Rectangle extends Shape {
    void methodRectangle()
    {
        System.out.println("This is rectangular shape.");
    }
}

class Circle extends Shape {
    void methodCircle()
    {
        System.out.println("This is circular shape.");
    }
}

class Square extends Rectangle {
    void methodSquare()
    {
        System.out.println("Square is a rectangle.");
    }
}

public class P4_20 {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.methodSquare();
        sq.methodRectangle();
        sq.methodShape();
    }
}
