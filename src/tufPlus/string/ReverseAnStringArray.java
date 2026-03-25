package tufPlus.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseAnStringArray {
    public static void main(String[] args) {
        List<Character> chars = Arrays.asList('h','e','l','l','o');
        reverseCharArray(chars);
    }

    private static void reverseCharArray(List<Character> chars) {

        int start = 0;
        int end = chars.size() - 1;

        while(start < end){
            char temp = chars.get(start);
            chars.set(start,chars.get(end));
            chars.set(end,temp);
            start++;
            end--;
        }
    }
}
