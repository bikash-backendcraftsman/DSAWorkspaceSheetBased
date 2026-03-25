package tufRevesion.basicString;

public class PallindromeCheck {
    public static void main(String[] args) {
        String s = "amanaplanacanalpanama";
        boolean val = checkIfStringPalindrome(s);
        System.out.println(val);
    }

    private static boolean checkIfStringPalindrome(String s) {
        if(s == null || s.length() == 0){
            return false;
        }

        int start = 0;
        int end = s.length() - 1;
        char[] charArray = s.toLowerCase().toCharArray();

        while (start < end){
            if(charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    /**
     * Another Code Approch with Slight Modification
     *
     * private static boolean checkIfStringPalindrome(String s) {
     *     if (s == null || s.length() == 0) {
     *         return false;
     *     }
     *
     *     int start = 0;
     *     int end = s.length() - 1;
     *     char[] charArray = s.toCharArray();
     *     boolean flag = true; // 🔹 key fix
     *
     *     while (start < end) {
     *         if (charArray[start] == charArray[end]) {
     *             start++;
     *             end--;
     *         } else {
     *             flag = false;
     *             break;
     *         }
     *     }
     *     return flag;
     * }
     */
}
