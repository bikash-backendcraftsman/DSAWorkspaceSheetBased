package neetCode.twoPointer;

public class ValidPalindrome_LeetCode125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
       boolean flag = isValidPalindrome(s);
        System.out.println("Print Valid Palindrome :"+ flag);
    }

    private static boolean isValidPalindrome(String s) {
        //edge case
        if(s == null || s.length() == 0){
            return false;
        }
        //we are trying to solve in two pointer approch
        String updated  = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int start = 0;
        int end = updated.length() - 1;

        while(start < end){
            if(updated.charAt(start) != updated.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
