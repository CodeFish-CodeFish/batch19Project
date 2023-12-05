package project3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        /*
        * Write the program to get the string value from the specified position. First, ask the user
to enter one String value. Then ask the user to the enter starting number and ending
number. After that, print the value between the given starting and ending numbers.
(Note: since the user does not know the java, the user starts counting from 1, and the
ending number will be included)
Example:
Please enter the String value:
Definition of Science
Please enter the starting number:
2
Please enter the ending number
5
The output is:
efin*/
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the starting number: ");
        int startingNum = input.nextInt();

        input.nextLine();//if you have nextInt() before nextLine() you need to use empty line


        System.out.print("Enter the sentence: ");
        String sentence = input.nextLine();

        System.out.println("Enter the ending number: ");
        int endingNum = input.nextInt();

        System.out.println("Result: " + sentence.substring(startingNum - 1, endingNum));

//Definition of Science
    }
}
