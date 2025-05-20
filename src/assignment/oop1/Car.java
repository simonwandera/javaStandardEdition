package src.assignment.oop1;

public class Car extends Vehicle {

//    private String model;

    public Car() {
    }

    public String getDescription(String model) {
        return "Car model is: " + super.getModel();
    }

    public Car(String model) {

        super(model);
//        this.model = model;
    }

    public void getCarDescription(){
        System.out.println("Car description: " + getDescription(getModel(), getColor(), getYearOfManufacture()));
    }


}
