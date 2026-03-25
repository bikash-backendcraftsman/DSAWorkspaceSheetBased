package striverAtoZ.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode {
    public static void main(String[] args) {
        String s = "leet**cod*e";
       String val =  removeStarMarkFromString(s);
        System.out.println(val);
    }

    private static String removeStarMarkFromString(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (ch == '*') {
                sb.deleteCharAt(sb.length() - 1); // remove last character
            } else {
                sb.append(ch); // push character
            }
        }

        return sb.toString();
    }
}
