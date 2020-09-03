package data;

public class Car extends Vehicle{

    private final String steeringType;
    private final int gears;
    private final String make;
    private final String model;
    private final int yearOfManufacture;
    private final int wheels;
    private final int doors;
    private final boolean isManual;
    private int gear;


    public Car(String steeringType, String make, String model, int yearOfManufacture, int wheels, int doors, boolean isManual,int gears, int speed, int length, int width, int height) {
        super("car", speed, length, width, height);
        this.steeringType=steeringType;
        this.gears=gears;
        this.make=make;
        this.model=model;
        this.yearOfManufacture = yearOfManufacture;
        this.wheels=wheels;
        this.doors=doors;
        this.isManual=isManual;

    }
    public void currentGear(int gear){
        this.gear=gear;
        System.out.println("gear now="+this.gear);
    }
}
