package crio101;

public class FindElement {
    public static void main(String[] args) {
        int[] array = {1};
        int x = 4;
        int val = findMatchingElement(array,x);
        System.out.println(val);
    }

    private static int findMatchingElement(int[] array, int x) {
        if(array.length == 0 ||x == 0){
            return -1;
        }
        for(int i = 0;i<array.length;i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
