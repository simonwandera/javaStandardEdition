package src.assignment.operators;

public class Operators {


    public void performOperations(int num1, int num2) {
        // Arithmetic Operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = (double) num1 / num2;

        // Relational Operations
        boolean isEqual = (num1 == num2);
        boolean isNotEqual = (num1 != num2);
        boolean isGreater = (num1 > num2);
        boolean isLess = (num1 < num2);

        // Logical Operations
        boolean andOperation = (num1 > 0 && num2 > 0);
        boolean orOperation = (num1 > 0 || num2 > 0);

        // Bitwise Operations
        int bitwiseAnd = num1 & num2;
        int bitwiseOr = num1 | num2;

        //Increment and Decrement
        int increment = num1++;
        int decrement = num2--;


        // Output results
        System.out.println("Arithmetic Operations:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        System.out.println("\nRelational Operations:");
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Is Not Equal: " + isNotEqual);
        System.out.println("Is Greater: " + isGreater);
        System.out.println("Is Less: " + isLess);

        System.out.println("\nLogical Operations:");
        System.out.println("AND Operation: " + andOperation);
        System.out.println("OR Operation: " + orOperation);

        System.out.println("\nBitwise Operations:");
        System.out.println("Bitwise AND: " + bitwiseAnd);
        System.out.println("Bitwise OR: " + bitwiseOr);

        System.out.println("\nIncrement and Decrement:");
        System.out.println("Increment: " + increment);
        System.out.println("Decrement: " + decrement);

    }

    public void logicOperations(int num1, int num2) {
        // Logical Operations num1 = 4 , num2 = 5


        boolean andOperation = (num1 < 0 && num2 > 0);
        boolean orOperation = (num1 < 0 || num2 > 0);

        // Output results
        System.out.println("\nLogical Operations:");
        System.out.println("AND Operation: " + andOperation);
        System.out.println("OR Operation: " + orOperation);
    }

    public void ternaryOperators() {
        int year = 2014;


//        if (year % 4 == 0) {
//            System.out.println(year + " is a leap year.");
//        } else {
//            System.out.println(year + " is not a leap year.");
//        }

        //Ternary Operator .jar, .war

        String result = (year % 4 == 0) ? year + " is a leap year." : year + " is not a leap year.";

//        (condition) ? expression1 : expression2;

        System.out.println(result);

    }

    public void incrementAndDecrement(){
        int a = 5;
        int b = 10;

        // Pre-increment
        int preIncrement = ++a; // a becomes 6, preIncrement is 6

        // Post-increment
        int postIncrement = b++; // postIncrement is 10, b becomes 11

        // Pre-decrement
        int preDecrement = --a; // a becomes 5, preDecrement is 5

        // Post-decrement
        int postDecrement = b--; // postDecrement is 11, b becomes 10

        System.out.println("Pre-increment: " + preIncrement);
        System.out.println("Post-increment: " + postIncrement);
        System.out.println("Pre-decrement: " + preDecrement);
        System.out.println("Post-decrement: " + postDecrement);
    }
}
