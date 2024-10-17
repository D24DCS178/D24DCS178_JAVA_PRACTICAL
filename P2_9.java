/*Given a string, return a string where for every char in the
original, there are two chars.
double_char('The') → 'TThhee'
double_char('AAbb') → 'AAAAbbbb'
double_char('Hi-There') → 'HHii--TThheerree */

class P2_9 {
    public static void main(String[] args) {
        String s1 = "Rutvi";

        System.out.println("String = "+double_char(s1));

    }
    static String double_char(String s)
    {
        String result = "";
        char []s1 = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            result = result + s1[i] + s1[i];
        }
        return result;
    }
}
