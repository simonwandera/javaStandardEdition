package src.assignment.io;

import java.util.HashMap;
import java.util.Map;

public class ExpressionsAndStatements {

    public void expressionsAndStatements() {
        //
        int score = 0, age = 16, height = 180;

        Double weight = age * 2.5;

        System.out.println("Weight: " + weight);


        if (age > 18) { // Start of the block
            System.out.println("You are an adult.");
            System.out.println("Your age is: " + age);
        } else {
            System.out.println("You are not an adult.");
        }
        //end

        /*
        If then
        if then else
        nested if
        switch statement


        Above 90 - Remarks - Excellent

        Above 75 - Grade - Good

        Above 50 - Grade - Average

        Below 50 - Grade - Poor

         */

    }

    public String gradingSystem(int score) {
        if (score > 90) {
            return "Excellent";
        } else if (score > 75) {
            return "Good";
        } else if (score > 50) {
            return "Average";
        } else {
            return "Poor";
        }
    }

    public void switchStatement(int score) {
        switch (score) {
            case 90:
                System.out.println("Excellent");
                break;
            case 75:
                System.out.println("Good");
                break;
            case 50:
                System.out.println("Average");
                break;
            default:
                System.out.println("Poor");
        }


//        int day = 3;
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid day");

        Map<Integer, String> days = new HashMap<>();
        days.put(1, "Monday");
        days.put(2, "Tuesday");
        days.put(3, "Wednesday");
        days.put(4, "Thursday");
        days.put(5, "Friday");
        days.put(6, "Saturday");
        days.put(7, "Sunday");

        days.get(2);


        }

    }
