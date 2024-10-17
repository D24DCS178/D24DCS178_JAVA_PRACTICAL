/* Create a class named 'Rectangle' with two data members
'length' and 'breadth' and two methods to print the area and
perimeter of the rectangle respectively. Its constructor
having parameters for length and breadth is used to
initialize length and breadth of the rectangle. Let class
'Square' inherit the 'Rectangle' class with its constructor
having a parameter for its side (suppose s) calling the  
constructor of its parent class as 'super(s,s)'. Print the area
and perimeter of a rectangle and a square. Also use array
of objects.*/


class Rectangle{
    int length;
    int breadth;

    Rectangle(int length,int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    void getRArea()
    {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    void getRPerimeter()
    {
        System.out.println("Perimeter of Rectangle: " +  (2*(length + breadth)));
    }
}

class Square extends Rectangle{

    Square(int length,int breadth)
    {
        super(length,breadth);
        this.length = length;
    }


    void getSArea()
    {
        System.out.println("Area of Square: " + (length * length));
    }

    void getSPerimeter()
    {
        System.out.println("Perimeter of Square: " + (4 * length));
    }
}

public class P4_19 {
    public static void main(String[] args) {
        Square r = new Square(4,6);
        Square s = new Square(5,0);
        s.getSArea();
        s.getSPerimeter();
        r.getRArea();
        r.getRPerimeter();
    }
}

