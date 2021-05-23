package pashkov;

import java.util.Random;

public class Task2 {

    private final static Random RANDOM = new Random();

    public static void main(String[] args) {
        /*2) Fill an array of 10 elements with random integers from 10 (inclusive) to 20 (inclusive).
             Print the arithmetic mean.*/
        int[] randomNumber = new int[11];
        double sum = 0;
        for (int i = 0; i < randomNumber.length; i++) {
            randomNumber[i] = RANDOM.nextInt(11) + 10;
            sum += randomNumber[i];
            System.out.print(randomNumber[i] + ", ");
        }
        double average = sum / randomNumber.length;
        System.out.println("\nArithmetic mean of array members = " + average);
    }
}
