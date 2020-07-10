package sample01;

import java.util.Scanner;

public class HelloWord {

    public static void main(final String[] args) {

        // Creates a reader instance which takes
        // input from standard input - keyboard
        final Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // nextInt() reads the next integer from the keyboard
        final int number = reader.nextInt();

        // println() prints the following line to the output screen
        System.out.println("You entered: " + number);
    }
}