package tufPlus.array.logicBuilding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArrayOptimizedApproch {
    public static void main(String[] args) {

        int[] array = {1,2,5,3,1,2};
        List<Integer> intList = leadersInArrayOptimized(array);
        System.out.println(intList);
    }

    private static List<Integer> leadersInArrayOptimized(int[] array) {

        //edge caes
        if(array == null || array.length == 0){
            return Collections.emptyList();
        }

        List<Integer> resultList = new ArrayList<>();
        int n = array.length -1 ;

        int maxFromRight = array[n];
        resultList.add(maxFromRight);
        for(int i = n ;i >= 0;i--){
            if(array[i] > maxFromRight){
                maxFromRight = array[i];
                resultList.add(maxFromRight);
            }
        }
        Collections.reverse(resultList);
        return resultList;

    }
}
