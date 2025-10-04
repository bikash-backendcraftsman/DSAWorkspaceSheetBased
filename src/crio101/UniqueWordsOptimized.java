package crio101;

import java.util.HashSet;

public class UniqueWordsOptimized {
    public static void main(String[] args) {
        String str = "Java is great Grails is also great";
        int val = uniqueWordsOptimized(str);
        System.out.println(val);
    }

    private static int uniqueWordsOptimized(String str) {
        String[] strArray = str.split(" ");
        HashSet<String> set = new HashSet<>();
        for(int i = 0;i<strArray.length;i++){
            set.add(strArray[i]);
        }
        return set.size();
    }
}
