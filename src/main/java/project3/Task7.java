package project3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //fahrenheit - 32 * 9/5;
        Scanner scanner  = new Scanner(System.in);

        System.out.println(" Enter The temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32 * 9/5);


        System.out.println("The temperature in Celsius is : " + celsius + " degrees.");

    }
}
