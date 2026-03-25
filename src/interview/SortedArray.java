package interview;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

//shift the zeroes and non zeros.
public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {2,5,8,0,6,4,0,3,0,9,1,7};

        // output {2,5,8,6,4,3,9,1,7,0,0,0}

       int[] result =  shiftElement(arr);
       for(int i = 0;i<result.length;i++){
           System.out.println(" "+i);
       }

    }

    private static int[] shiftElement(int[] arr) {
        int[] result = new int[arr.length];
        int idx = 0;
        Arrays.sort(arr);
        for(int val : arr){
            result[idx] = val;
            idx++;
        }
        return result;
    }
}
