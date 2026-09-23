package tufPlus.array.logicBuilding;

public class PascalTraingle {
    public static void main(String[] args) {
        int noOfRows = 5;

       for(int i = 0;i <= noOfRows;i++){

           for(int j = 1;j < i;j++){
               System.out.print(j);
           }
           System.out.println();
       }
    }
}
