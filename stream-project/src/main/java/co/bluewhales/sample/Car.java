package co.bluewhales.sample;

public class Car {
    private String color;

    public Car(String color) {
        this.color = color;
        System.out.println("Car is painted " + color);
    }

    public String getColor() {
        return color;
    }
}
