package pashkov;

public class Task1 {

    public static void main(String[] args) {
     /* 1) Print a series of numbers from 1 to 100 separated by a space, with the changes:
        - if the number is a multiple of 3 then output Hello instead
        - if the number is a multiple of 5 then display World instead
        - if the number is a multiple of both 3 and 5 then print HelloWorld instead*/
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("HelloWorld ");
            } else if (i % 3 == 0) {
                System.out.print("Hello ");
            } else if (i % 5 == 0) {
                System.out.print("World ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
