package crio101;

public class DistinctNumberBasic {
    public static void main(String[] args) {
        int[] array = {2,3,3};
        int val = distinctNumberBasic(array);
        System.out.println(val);
    }

    private static int distinctNumberBasic(int[] array) {
        if(array.length == 0){
            return -1;
        }
        int n = array.length;
        int count = 0;
        for(int i = 0;i<n;i++){
            boolean flag = false;
            for(int j = 0;j < i;j++) {
                if (array[i] == array[j]) {
                    flag = true;
                    break;
                }
            }
            if(!flag) count++;

        }
        return count;
    }
}
