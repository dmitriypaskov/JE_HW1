package pashkov;

import java.util.Random;

public class EX2 {

    private final static Random RANDOM = new Random();

    public static void main(String[] args) {
        /*2) Fill an array of 10 elements with random integers from 10 (inclusive) to 20 (inclusive).
             Print the arithmetic mean.*/
        int[] arr = new int[11];
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RANDOM.nextInt(11) + 10;
            sum += arr[i];
            System.out.print(arr[i] + ", ");
        }
        double average = sum/ arr.length;
        System.out.println("\nArithmetic mean of array members = " + average);
    }
}
