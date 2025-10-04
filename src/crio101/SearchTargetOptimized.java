package crio101;

public class SearchTargetOptimized {
    public static void main(String[] args) {
        int[] array = {1,3,5,7,13};
        int target = 7;
        // Here we are optimizing this code. As the array is sorted, we are using Binary Search
        int val = searchTargetOptimized(array,target);
        System.out.println("Matching index found for the target :"+val);
    }

    private static int searchTargetOptimized(int[] array, int target) {
        if(array.length == 0 || target == 0){
            return -1;
       }
        // Here we are using Binary Search
        int start = 0;
        int end = array.length - 1;
        int mid = start + (end - start)/2;
        while(start <= end){
            if(array[mid] > target){
                end = mid - 1;
            }else if(array[mid] < target){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
