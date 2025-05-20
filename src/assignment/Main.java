package src.assignment;

import src.assignment.introduction.Introduction;
import src.assignment.io.BasicInputAndOutput;
import src.assignment.oop1.AnotherCar;
import src.assignment.oop1.Car;
import src.assignment.oop1.Status;
import src.assignment.oop1.TrainBooking;
import src.assignment.oop1.TrainBookingI;
import src.assignment.oop1.Vehicle;
import src.assignment.operators.Operators;
import src.assignment.zipzap.Assignment;

public class Main {

    //This code is a simple Java program that prints "Good morning" to the console.


    public static void main(String[] args) {

        Introduction introduction = new Introduction();
//        introduction.javaIntroduction();

        Assignment assignment = new Assignment();
//        assignment.printMessage();

        // This is a comment
        // System.out.println("Good morning");

        Operators operators = new Operators();
//        operators.performOperations(1100, 3);
//        operators.ternaryOperators();
//        operators.incrementAndDecrement();


        BasicInputAndOutput basicInputAndOutput = new BasicInputAndOutput();
//        basicInputAndOutput.input();

        Vehicle toyota = new Vehicle("Toyota", "Red", 2020, 20000);
        toyota.setNumberOfWheels(6);

        Vehicle.setNumberOfVehicles(3);

        Vehicle nissan = new Vehicle("Nissan" ); //lombok
        nissan.setNumberOfWheels(8);


        Vehicle mazda = new Vehicle();
        mazda.setColor("Red");
        mazda.setModel("CX5");
        mazda.setYearOfManufacture(2021);
        mazda.numberOfDoors = 4;

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
        mercedes.setNumberOfWheels(5);
        mercedes.setModel("Mercedes");
        mercedes.setColor("White");

        Vehicle audi = new Vehicle(2024);


//        System.out.println("Toyota Number of wheels: " + toyota.getNumberOfWheels());
//        System.out.println("Nissan Number of wheels: " + nissan.getNumberOfWheels());
//        System.out.println("Number of vehicles: " + bmw.getNumberOfVehicles());
//        System.out.println("Bmw number of wheels: " + bmw.getNumberOfWheels());
//
//        System.out.println("Mercedes description: " + mercedes.getDescription(mercedes.getModel(), mercedes.getColor(), mercedes.getYearOfManufacture()));
//        System.out.println("Mercedes description: " + mercedes.getDescription(mercedes.getModel(), mercedes.getColor()));
//        System.out.println("Mercedes description: " + mercedes.getDescription(mercedes.getModel()));
//        System.out.println("Mercedes description: " + mercedes.getDescription());


        Car audiCar = new Car("Audi");

        audiCar.setColor("Red");
        audiCar.setYearOfManufacture(2023);


        Car volvo = new Car("Volvo");

        String description = audiCar.getDescription(audiCar.getModel(), audiCar.getColor());


        System.out.println(description);




        AnotherCar anotherCar = new AnotherCar();
        anotherCar.setModel("Civic");
        anotherCar.setColor("Red");
        anotherCar.setCarStatus(Status.PENDING);

        System.out.println("AnotherCar description: " + anotherCar.getDescription());

        System.out.println(" Another car status: " + anotherCar.getCarStatus().getName());

        System.out.println("Audi description: " + audiCar.getDescription(audi.getModel()));
        System.out.println("Volvo description: " + volvo.getDescription(volvo.getModel()));

        TrainBookingI trainBooking = new TrainBooking();

        trainBooking.bookTicket("A1", 1000.0);

        Boolean isAvailable = trainBooking.checkAvailability("A1");

        String cancel = trainBooking.cancelTicket("A1");

        System.out.println(isAvailable);
        System.out.println(cancel);


    }


}
