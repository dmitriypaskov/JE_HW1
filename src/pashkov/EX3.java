package pashkov;

public class EX3 {

    public static void main(String[] args) {
        /*3) Write a method that will return a String in which there will be numbers from 1 to 30 in one line.
             In this case, put each number in parentheses ()*/
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 30; i++) {
            stringBuilder.append("(").append(i).append(") ");
        }
        System.out.println(stringBuilder);
    }
}
