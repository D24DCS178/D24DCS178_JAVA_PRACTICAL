/*Write an example that counts the number of
 times aparticular character, such as e, appears in a file. The
character can be specified at the command line. You can
use xanadu.txt as the input file.*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P6_28 {
    public static void main(String[] args) {
        char c = args[0].charAt(0);
        System.out.println(c);
        try(BufferedReader br = new BufferedReader(new FileReader("firsts.txt"))) {
            int occur = 0;
            int i;
            while ((i = br.read()) != -1) {
                if (i == c) {
                    occur++;
                }
            }
            System.out.println("occurence of "+ c +" in firsts.txt = "+occur);
        } catch (FileNotFoundException e) {
            System.out.println("Given file is not exist");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}