/*Write a program that will count the number of lines in
each file that is specified on the command line. Assume
that the files are text files. Note that multiple files can be
specified, as in "java Line Counts file1.txt file2.txt
file3.txt". Write each file name, along with the number of
lines in that file, to standard output. If an error occurs
while trying to read from one of the files, you should print
an error message for that file, but you should still
process all the remaining files. */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P6_27 {
    public static void main(String[] args) {
        // try {
        //     File file = new File("D:\\BTECH\\SEM3\\JAVA\\text\\first.txt");
        //     Scanner sc = new Scanner(file);
        //     int lines = 0;
        //     while (sc.hasNextLine()) {
        //         lines++;
        //         sc.nextLine();
        //     }
        //     System.out.println("no of lines in first.txt = "+lines);
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter file name:");
        if (args.length == 0) {
            System.out.println("file is not given");
        }
        String name[] = new String[args.length];
        for(int i = 0;i < args.length;i++)
        {
            name[i] = args[i];
            name[i] = name[i]+".txt";
        }
        for (String name1 : name) {
            try {
                FileReader fr = new FileReader(name1);    
                BufferedReader br = new BufferedReader(fr);
                int lines = 0;
                while ((br.readLine()) != null) {
                    lines++;
                }
                System.out.println("no of lines in first.txt = "+lines);
            }catch (FileNotFoundException e) {
                System.out.println("Given file is not exist");
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
