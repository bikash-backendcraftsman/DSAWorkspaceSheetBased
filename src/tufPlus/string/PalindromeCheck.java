package tufPlus.string;

public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "aabbaaa";
        boolean val = checkPalindrome(s);
        System.out.println(val);
    }

    private static boolean checkPalindrome(String s) {
        if(s == null || s.length() == 0){
            return false;
        }

        char[] charArray = s.toLowerCase().toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while(start < end){
            if(charArray[start] != charArray[end]){
                return false;
            }
            start++;
            end--;

        }
        return true;
    }
}
