package corejava.collection.listData.sortingTechnique;

public class Vehicle implements Comparable<Vehicle>{
    private int vehicleId;
    private int purchaseYear;

    public Vehicle(int vehicleId, int purchaseYear) {
        this.vehicleId = vehicleId;
        this.purchaseYear = purchaseYear;
    }



    @Override
    public int compareTo(Vehicle o) {
        // We can also use the compareTo() method of the Integer class.
        return this.purchaseYear - o.purchaseYear;
    }

    @Override
    public String toString(){
        return "Yaer"+":"+purchaseYear+"========"+"Vehicle Id :"+ vehicleId;
    }
}
