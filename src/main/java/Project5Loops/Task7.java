package Project5Loops;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive number: ");
        int n = scanner.nextInt();

        while (n <=0 ){
            System.out.println("Please enter a positive number.");
            System.out.println("Please enter one more time");
            n = scanner.nextInt();
        }

        scanner.close();

        int sumOfEven = 0;
        int i = 1;
        while (i <=n){
            if (i % 2 == 0 ){
                sumOfEven += i;
                System.out.print(i + " ");
            }
            i ++;
        }

        System.out.println();
        System.out.println("Sum of even numbers from 1 to "+ n + " : "+ sumOfEven);

    }
}
