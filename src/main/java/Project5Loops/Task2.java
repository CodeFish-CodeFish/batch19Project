package Project5Loops;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Max number: ");
        int max = scanner.nextInt();
        System.out.println("Please enter the Min number: ");
        int min = scanner.nextInt();

        int sum = 0;

        for (int i = min; i <= max; i ++){
            if (i % 3 == 0 && i % 11 == 0 ){
               sum += i;
                System.out.println(i);
            }
        }
        System.out.println("The result is: " + sum);
    }
}
// we need to find sum of the numbers between 0 - 120 which divisible to 11 and 3
// for loop until 120
// start from  0
// if number / 3 and number / 11 {
//create a sum
//{
//
//        }
