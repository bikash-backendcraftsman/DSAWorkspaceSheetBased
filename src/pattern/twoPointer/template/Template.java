package pattern.twoPointer.template;

public class Template {
    public static void main(String[] args) {
        //int[] array = {1,2,15,17,19,20};

        int[] array = {1, 3, 5, 7, 10};
        int target = 12;

        boolean val =  twoPointerTemplate(array,target);
        System.out.println("Print Val :"+val);
    }

    private static boolean twoPointerTemplate(int[] array, int target) {
        //edge cases
        if(array == null || array.length < 2){
            return false;
        }

        int start = 0;
        int end = array.length - 1;

        while(start < end){

            if(array[start] + array[end] == target){
                return true;
            } else if(array[start] + array[end] > target){
                end --;
            }else {
                start++;
            }
        }
        return false;
    }
}

/**
 *
 */