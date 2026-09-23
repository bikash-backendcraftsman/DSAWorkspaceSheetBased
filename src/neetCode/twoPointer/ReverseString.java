package neetCode.twoPointer;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseStringInPlace(s);
    }

    private static void reverseStringInPlace(char[] s) {
        //in place reverse we have to do

        int start = 0;
        int end = s.length - 1;

        while (start < end){
            char swap = s[start];
            s[start] = s[end];
            s[end] = swap;
        }
        start++;
        end--;
    }
}
