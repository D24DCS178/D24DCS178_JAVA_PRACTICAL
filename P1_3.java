import java.util.Scanner;

public class P1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the distance in meter");
        double dis = sc.nextDouble();

        System.out.println("enter time in Hour, Minute & Seconds:");
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();
        sc.close();

        int totaltimeinsec = hour * 3600 + minute * 60 + second;

        double meterpersec = dis / totaltimeinsec;
        double kiloperhour = (dis/1000)/(totaltimeinsec/3600);
        double mileperhour = (dis/1609)/(totaltimeinsec/3600);
        
        System.out.println("speed:");
        System.out.println("Meter per Second:"+meterpersec);
        System.out.println("KiloMeter per Hour:"+kiloperhour);
        System.out.println("Miles per Hour:"+mileperhour);
    }
}
