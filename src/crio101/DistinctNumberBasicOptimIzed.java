package crio101;

import java.util.HashSet;
import java.util.Set;

public class DistinctNumberBasicOptimIzed {
    public static void main(String[] args) {
        int[] array = {2,3,3,1,2,3};
        int val = distinctNumberBasicsOptimized(array);
        System.out.println(val);
    }

    private static int distinctNumberBasicsOptimized(int[] array) {
        Set<Integer> uniQueSet = new HashSet<>();
        for(int i = 0;i<array.length;i++){
            uniQueSet.add(array[i]);
        }
        int count = uniQueSet.size();
        return count;
    }
}
