package models;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int numberFloor;

    public Villa(String roomStandard, double poolArea, int numberFloor) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberFloor = numberFloor;
    }

    public Villa(String serviceName, int usableArea, double rentalCosts, int maximum, String rentalType, String roomStandard, double poolArea, int numberFloor) {
        super(serviceName, usableArea, rentalCosts, maximum, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberFloor = numberFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }
}
