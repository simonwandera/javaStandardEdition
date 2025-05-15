package src.assignment.io;

import java.util.Scanner;

public class BasicInputAndOutput {

    public  void output() {

        String name = "John";
        System.out.println("Hello, " + name + "!");
        System.out.print("Hello, ");
        System.out.printf("Hello, %s!", "World");
        System.out.printf("Hello, %f", 0.2);

    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");

        int age = 0;
        try {
             age = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer for age.");
            scanner.next(); // Clear the invalid input
        }


//        if (age ) {}
//        System.out.println("Enter Float value: ");
//        float value = scanner.nextFloat();
//
//        System.out.println("Enter Double value: ");
//        double value2 = scanner.nextDouble();


        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        scanner.close();
    }
}
