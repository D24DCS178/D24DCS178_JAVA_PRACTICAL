import  java.util.Scanner;

class Area {
    int length;
    int breadth;
    
    Area(int length,int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    int returnArea()
    {
        return length * breadth;
    }
}

public class P3_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter length and breath of the rectangle:");
        int len = sc.nextInt();
        int br = sc.nextInt();
        sc.close();
        Area a = new Area(len,br);
        int area = a.returnArea();
        System.out.println("area of the reactangle is "+area);
    }
}
