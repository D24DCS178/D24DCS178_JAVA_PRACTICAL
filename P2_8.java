/* Given an array of ints, return the number of 9's in the
array. array_count9([1, 2, 9]) → 1
array_count9([1, 9, 9]) → 2
array_count9([1, 9, 9, 3, 9]) → 3 */

class P2_8 {
    public static void main(String[] args) {
        int arr[] = {1, 9, 9, 3, 9};
        int ans = array_count9(arr);

        System.out.println("total no. of 9 in the array = "+ans);

    }
    static int array_count9(int[] s)
    {
        int count = 0;
        for (int idx = 0; idx < s.length; idx++) {
            if(s[idx] == 9)
            {
                count++;
            }
            
        }
        return count; 
    }
}
