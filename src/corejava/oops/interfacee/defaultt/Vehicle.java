package corejava.oops.interfacee.defaultt;

public interface Vehicle {

    void cleanVehicle();

    default void startVehicle(){
        System.out.println("Vehicle started..!!");
    }
}
