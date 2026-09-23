package neetCode.twoPointer;

public class checkPalindrome {
    public static void main(String[] args){
        String str = "bikash";
        boolean value = checkStringPalindrome(str);
        System.out.println("String is Palindrome :"+value);
    }

    private static boolean checkStringPalindrome(String str) {

        //edgs case
        if(str == null){
            return false;
        }

        int start = 0;
        int end = str.length() - 1;

        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }else {
                start++;
                end--;
            }
        }
        return true;
    }
}
