package ss5_access_modifier_static_method_static_property.practice.static_propery;

public class Car {
    private String name;

    private String engine;


    public static int numberOfCars;


    public Car(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;

    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public static void setNumberOfCars(int numberOfCars) {
        Car.numberOfCars = numberOfCars;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
