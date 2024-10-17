/*Perform following Functionalities of the string:
"CHARUSAT UNIVERSITY"
Find length
 Replace ‘H’ by ‘FIRST LATTER OF YOUR NAME’
 Convert all character in lowercase */

class P2_11 {
    public static void main(String[] args) {
        String s1 = "CHARUSAT UNIVERSITY";
        int lenghString = s1.length();
        String replaceChar = s1.replace('H', 'R');
        String Lowercase = replaceChar.toLowerCase();

        System.out.println("length of the string = "+lenghString);
        System.out.println("Uppercase = "+replaceChar);
        System.out.println("length of the string = "+Lowercase);

    }
}
