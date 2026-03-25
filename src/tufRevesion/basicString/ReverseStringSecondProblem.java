package tufRevesion.basicString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ReverseStringSecondProblem {
    public static void main(String[] args) {
        List<Character> chars = Arrays.asList('h','e','l','l','o');
        reverseString(chars);
    }

    private static void reverseString(List<Character> s) {

        int low = 0;
        int high = s.size() - 1;

        while(low < high){
          char swap = s.get(high);
            s.set(high,s.get(low));
            s.set(low,swap);
            low++;
            high--;
        }
    }
}
