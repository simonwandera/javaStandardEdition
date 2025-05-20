package src.assignment.oop1;

public class Vehicle {

    //fields
    private String model;
    private String color;
    private int yearOfManufacture;//instance variable
    private int numberOfWheels = 4;//class variable
    public int numberOfDoors = 4;//class variable

    private Status carStatus = Status.NEW;//enum variable

    private static int numberOfVehicles = 0;//static variable

    //constant
    public static final int MAX_VEHICLES = 100;


    public Vehicle(String mymodel, String color, int yearOfManufacture, int price) {
        this.model = mymodel;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;

    }

    public Vehicle(String model) {
        this.model = model;
    }

    public Vehicle(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
        Vehicle v = new Vehicle();
    }

    //default constructor
    public Vehicle() {

    }


    public String getDescription(String model, String color, int yearOfManufacture) {
        return "Model: " + model + ", Color: " + color + ", Year of Manufacture: " + yearOfManufacture;
    }


    //overloaded method
    public String getDescription(String model, String color) {
        return "Model: " + model + ", Color: " + color;
    }

    public String getDescription(String model) {
        return "Model: " + model;
    }

    public String getDescription(int yearOfManufacture) {
        return "Year: " + yearOfManufacture;
    }

    public String getDescription() {
        return "Model: " + model + ", Color: " + color + ", Year of Manufacture: " + yearOfManufacture;
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

    public Status getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(Status carStatus) {
        this.carStatus = carStatus;
    }
}