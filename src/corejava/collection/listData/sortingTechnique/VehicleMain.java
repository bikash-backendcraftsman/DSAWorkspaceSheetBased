package corejava.collection.listData.sortingTechnique;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VehicleMain {
    public static void main(String[] args) {
        List<Vehicle> vhList = new ArrayList<>();
        vhList.add(new Vehicle(101,2003));
        vhList.add(new Vehicle(102,1980));
        vhList.add(new Vehicle(103,1975));

        Collections.sort(vhList);
        System.out.println(vhList);
    }
}
