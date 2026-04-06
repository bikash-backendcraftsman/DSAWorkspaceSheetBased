package intervie;

public class ReverseArray {

    public static void main(String[] args){
       // int[] array = {5,7,2,3,1};
        int[] array = null;
        reverseArray(array);

        //1. optimized tc and sc
        //2. edge cases
        //3. own logic

    }

    private static void reverseArray(int[] array) {
        //two pinter approach

        if(array.length == 0 || array == null){
            System.out.println("Array contain empty elements");
        }

        int start = 0;
        int end = array.length - 1;

        while(start < end){
            int swap  = array[end];
            array[end] = array[start];
            array[start] = swap;
            start++;
            end--;
        }

        for (int i = 0;i<array.length;i++){
            System.out.print(" "+array[i]);
        }
    }
}
