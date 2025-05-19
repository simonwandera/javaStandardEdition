package src.assignment.oop1;

import java.util.Arrays;

public class ArraysRecap {


    public void arraysRecap() {
        // Array declaration
        int[][] numbers; // Array of integers with size 5

        // Array initialization
         numbers = new int[][]{
                 {1, 2, 3, 4},
                 {5, 6, 7, 8},
                 {9, 10, 11, 12}
         };

         for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers[i].length; j++) {

                    System.out.print("Row: " + i + ", Column: " + j + " - \t");
                    System.out.print(numbers[i][j] + " " + "\n");
                }
         }

        // Accessing array elements

    }


    public void trainSystem(){

        int [] totalSeats = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        //Make a copy

        int [] copyOfTotalSeats = new int[totalSeats.length];

        for (int i = 0; i < totalSeats.length; i++) {
            copyOfTotalSeats[i] = totalSeats[i];
        }

        copyOfTotalSeats[0] = 100;
        copyOfTotalSeats[1] = 200;


        int [] thirdCopy = Arrays.copyOf(totalSeats, totalSeats.length);

        thirdCopy[0] = 1000;
        thirdCopy[1] = 2000;

        //System.arrayCopy

        System.out.println("Original Array: " + Arrays.toString(totalSeats));
        System.out.println("Copy Array: " + Arrays.toString(copyOfTotalSeats));
        System.out.println("Third Copy Array: " + Arrays.toString(thirdCopy));



    }

    public static void main(String[] args) {
        ArraysRecap arraysRecap = new ArraysRecap();
//        arraysRecap.arraysRecap();

        arraysRecap.trainSystem();
    }
}
