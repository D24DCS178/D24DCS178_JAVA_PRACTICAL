import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P5 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("D:\\BTECH\\SEM3\\JAVA\\text\\first.txt")) {
            BufferedReader br = new BufferedReader(fr);
            int character;
            while ((character = br.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}