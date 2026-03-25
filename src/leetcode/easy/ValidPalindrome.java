package leetcode.easy;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "maam";
       boolean val =  checkPalindromeString(s);
        System.out.println("String is Pallindrome :"+val);
    }

    private static boolean checkPalindromeString(String s) {

        //edge case
        if(s == null || s.length() == 0){
            return false;
        }

        String trimmedString = s.trim().toLowerCase();
        System.out.println(trimmedString);

        StringBuilder sb = new StringBuilder();
        //bruteforce

        //maam =  4

        //3 >= 0 true i--> 3
        //2 >= 0 true i--> 2
        //1 >= 0 true i--> 1
        //0 >= 0 true i --> 0
        for(int i = trimmedString.length()-1;i >= 0;i--){
            sb.append(trimmedString.charAt(i));
        }
        return sb.toString().equals(trimmedString);
    }
}
