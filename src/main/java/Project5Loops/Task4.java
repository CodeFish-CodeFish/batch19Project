package Project5Loops;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number less than 10: ");
        int num = scanner.nextInt(); //3

        scanner.close();
        for (int i = num; i >= 1; i--) { // i = 1 // i > 1 true;
            for (int j = 1; j <= i; j++) { // j = 1 <= 2 true
                System.out.print(i);//333
                //22
                //1
            }
            System.out.println();
        }
    }
}