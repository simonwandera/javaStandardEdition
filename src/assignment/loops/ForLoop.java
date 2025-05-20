package src.assignment.loops;

import src.assignment.io.ExpressionsAndStatements;

import java.util.Arrays;

public class ForLoop {


    protected String getName(){
        return "ForLoop";
    }

    public void grading() {


        String []names = {"John", "Jane", "Doe", "Smith", "Alice", "Bob", "Charlie", "Dave"};

        ExpressionsAndStatements expressionsAndStatements = new ExpressionsAndStatements();

//        for (int i = 0; i < grades.length; i++) {
//            String result = expressionsAndStatements.gradingSystem(grades[i]);
//            System.out.println("Grade: " + grades[i] + " - Result: " + result);
//        }


//        for( int grade: grades){
//            int rem = grade % 2;
//            if (rem != 0)
//                break;
//
//            sum = sum + grade;
////            break;
//
//        }

        int []grades = {29, 45, 67, 100, 89, -95, 90, 12};
        int sum = 0;
        int max = grades[0];


        for(int grade : grades){
            sum = sum + grade;

            if (grade > max){
                max = grade;
            }


//            System.out.println("Grade: " + grade);
        }


        System.out.println("Max is : " + max);


        //for each loop / Enhanced for loop
//        for( int grade: grades){
//
//            String result = expressionsAndStatements.gradingSystem(grade);
//            System.out.println("Grade: " + grade + " - Result: " + result);
//
//            if (grade < 0){
//                System.out.println("Invalid grade: " + grade);
//                continue; // Skip the rest of the loop for this iteration
//            }else {
//                System.out.println("Score: " + grade);
//                break; // Exit the loop if the grade is 100
//            }
//
//        }

//        for(String name: names){
//            System.out.println("Name: " + name);
//        }


    }

}
