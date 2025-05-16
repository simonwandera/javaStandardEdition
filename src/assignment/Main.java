package src.assignment;

import src.assignment.introduction.Introduction;
import src.assignment.io.BasicInputAndOutput;
import src.assignment.loops.ForLoop;
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


        ForLoop forLoop = new ForLoop();
        forLoop.grading();



    }


}
