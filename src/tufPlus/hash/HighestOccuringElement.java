package tufPlus.hash;

public class HighestOccuringElement {
    public static void main(String[] args) {
       int[] array = {2,2,7,1};
        //int[] array = {4,4,5,5,6};
        int val = maximumOcuringElements(array);
        System.out.println(val);
    }

    private static int maximumOcuringElements(int[] array) {
        if(array.length == 0){
               return -1;
            }
        boolean[] visited = new boolean[array.length];
        int maxFreq = 0;
        int maxElement = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++){
               if(visited[i]) continue; // Skip already counted elements
               int freq = 1;
                for(int j = i + 1; j < array.length; j++){
                        if(array[i] == array[j]){
                                freq++;
                                visited[j] = true;
                            }
                    }
                if(freq > maxFreq){
                        maxFreq = freq;
                        maxElement = array[i];
                    } else if(freq == maxFreq && array[i] < maxElement){
                        maxElement = array[i];
                    }
            }
        return maxElement;
    }
}
