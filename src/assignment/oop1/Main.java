package src.assignment.oop1;


import src.assignment.loops.ForLoop;

public class Main {


    public static void main(String[] args) {

        Vehicle toyota = new Vehicle("Toyota", "Red", 2020, 20000);
        toyota.setNumberOfWheels(6);

        Vehicle.setNumberOfVehicles(3);

        Vehicle nissan = new Vehicle("Nissan" ); //lombok
        nissan.setNumberOfWheels(8);


        Vehicle mazda = new Vehicle();
        mazda.setColor("Red");
        mazda.setModel("CX5");
        mazda.setYearOfManufacture(2021);

        Vehicle honda = new Vehicle();
        honda.setColor("Yellow");
        honda.setModel("Civic");
        honda.setYearOfManufacture(2022);
        honda.setNumberOfVehicles(4);

        Vehicle bmw = new Vehicle();
        bmw.setColor("Black");
        bmw.setModel("X5");
        bmw.setYearOfManufacture(2023);

        Vehicle mercedes = new Vehicle();
        mercedes.setYearOfManufacture(2024);

        Vehicle audi = new Vehicle(2024);


        System.out.println("Toyota Number of wheels: " + toyota.getNumberOfWheels());
        System.out.println("Nissan Number of wheels: " + nissan.getNumberOfWheels());
        System.out.println("Number of vehicles: " + bmw.getNumberOfVehicles());
        System.out.println("Bmw number of wheels: " + bmw.getNumberOfWheels());

        /*

        Access modifiers
        Private: The member is accessible only within the same class.

        //DA layer
        Service layer
        presentation layer

        ENUMS, Access modifiers, Array copy, whileLoop






         */


    }
}
