package models;

public class Room extends Facility {
    private String serviceFree;

    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public Room(String serviceName, int usableArea, double rentalCosts, int maximum, String rentalType, String serviceFree) {
        super(serviceName, usableArea, rentalCosts, maximum, rentalType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }
}
