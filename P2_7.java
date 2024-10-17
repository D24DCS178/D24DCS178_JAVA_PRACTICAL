/*Given a string and a non-negative int n, we'll say that the
front of the string is the first 3 chars, or whatever is there if
the string is less than length 3. Return n copies of the front;
front_times('Chocolate', 2) → 'ChoCho'
front_times('Chocolate', 3) → 'ChoChoCho'
front_times('Abc', 3) → 'AbcAbcAbc' */

class p2_7 {
    public static void main(String[] args) {
        String s1 = "Chocolate";
        String ans = front_times(s1,3);

        System.out.println("String = "+ans);

    }
    static String front_times(String s,int n)
    {
        String s2 = s.substring(0, 3);
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + s2;
        }
        return result;
    }
}