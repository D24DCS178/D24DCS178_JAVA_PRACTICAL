
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*Write a program to copy data from one file to another file.
If the destination file does not exist, it is created
automatically.
 */

public class P6_30 {
    public static void main(String[] args) {
        String sfp = "firsts.txt";
        String dfp = "first.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(sfp));BufferedWriter writer = new BufferedWriter(new FileWriter(dfp))) {
            String line;
            while ((line = reader.readLine()) != null) {   
                writer.write(line);
                writer.newLine();           
            }

            System.out.println("file copid successfully!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
