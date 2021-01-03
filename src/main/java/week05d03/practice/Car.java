package week05d03.practice;

public class Car {

    private Engine engine;
    private String brand;
    private String colour;
    private int numberOfDoors;


    public Car(Engine engine, String brand, String colour, int numberOfDoors) {
        this.engine = engine;
        this.brand = brand;
        this.colour = colour;
        this.numberOfDoors = numberOfDoors;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
