package src.assignment.oop1;

public class Vehicle {

    //fields
    private String model;
    private String color;
    private int yearOfManufacture;
    private int price;
    private int numberOfWheels = 4;

    private static int numberOfVehicles = 0;


    public Vehicle(String model, String color, int yearOfManufacture, int price) {
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
    }

    public Vehicle(String model) {
        this.model = model;
    }

    public Vehicle(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    //default constructor
    public Vehicle() {

    }

    //methods
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public static int getNumberOfVehicles() {
        return numberOfVehicles;
    }

    public static void setNumberOfVehicles(int numberOfVehicles) {
        Vehicle.numberOfVehicles = numberOfVehicles;
    }
}