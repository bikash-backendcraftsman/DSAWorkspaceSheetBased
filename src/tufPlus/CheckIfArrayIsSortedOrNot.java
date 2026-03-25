package tufPlus;

public class CheckIfArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,0};

        boolean val = checkIfArraySortedOrNot(array);
        if(val){
            System.out.println("Array is sorted :"+val);
        }else {
            System.out.println("Array is not sorted :"+!val);
        }
    }

    private static boolean checkIfArraySortedOrNot(int[] array) {
        /*int forLoopOne_Count = 0;
        int foorLoopTwo_Count = 0;*/
        for(int i = 0;i< array.length-1;i++){
            //forLoopOne_Count++;
            //System.out.println("Calling count in the first for loop :"+forLoopOne_Count);
                //foorLoopTwo_Count++;
                //System.out.println("Calling count in the second for loop :"+foorLoopTwo_Count);
                if(array[i] > array[i+1]) {
                    //System.out.println("This if block is executing");
                    return false;
                }
                i++;
               // System.out.println("Increasing j Value :"+j);
            }
        return true;
    }
}
