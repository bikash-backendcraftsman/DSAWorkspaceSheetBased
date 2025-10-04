package crio101;

public class SearchTargetBruteForce {
    public static void main(String[] args) {
        int[] A = {1,3,5,7,13};
        int target = 7;
        int val = searchTargetBruteForce(A,target);
        System.out.println("Matching index found for the target :"+val);
    }

    private static int searchTargetBruteForce(int[] A, int target) {
        if(A.length == 0 || target == 0){
            return -1;
        }
        for(int i = 0;i<A.length;i++){
            if(A[i] == target){
                return i;
            }
        }
        return -1;
    }
}
