package co.bluewhales.stream;

public class Car {

    private String carId;
    private String name;
    private char condition;
    private long mileage;
    private double value;

    Car(String carId, int value, String name, char condition, int mileage) {
        this.carId = carId;
        this.value = value;
        this.name = name;
        this.condition = condition;
        this.setMileage(mileage);
    }

    public String getCarId() {
        return carId;
    }

    public String getName() {
        return name;
    }

    public char getCondition() {
        return condition;
    }

    public double getValue() {
        return value;
    }
    
    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }
}
