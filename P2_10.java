/* Perform following functionalities of the string:
 Find Length of the String
 Lowercase of the String
 Uppercase of the String
 Reverse String
 sort the String
 */

import java.util.Arrays;

class P2_10 {
    public static void main(String[] args) {
        String s1 = "Rutvi";
        int lenghString = s1.length();
        String uppercase = s1.toUpperCase();
        String Lowercase = s1.toLowerCase();
        char[] charArray = s1.toCharArray();
        Arrays.sort(charArray);
        String sort = new String(charArray);
        String reverse = "";
        for (int i = s1.length()-1; i >= 0; i--) {
            reverse += s1.charAt(i);
        }

        System.out.println("length of the string = "+lenghString);
        System.out.println("Uppercase = "+uppercase);
        System.out.println("length of the string = "+Lowercase);
        System.out.println("reverse = "+reverse);
        System.out.println("sort = "+sort);

    }
}
