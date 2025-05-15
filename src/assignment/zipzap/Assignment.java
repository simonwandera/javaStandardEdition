package src.assignment.zipzap;

public class Assignment {

    /*
    Write a Java program that prints numbers from 1 to N, following these specific rules:
    If a number is divisible by 3, print "Zip" instead of the number.
    If a number is divisible by 5, print "Zap" instead of the number.
    If a number is divisible by both 3 and 5, print "ZipZap" instead of the number.
    If none of the above, simply print the number itself.

     */


    public void printMessage() {
        int N = 30; // You can change this value to any positive integer

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("ZipZap");
            } else if (i % 3 == 0 || i % 5 == 0) {
                System.out.println("Zip or Zap");
            } else {
                System.out.println(i);
            }
        }

    }

}
