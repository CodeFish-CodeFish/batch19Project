package Project5Loops;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number less than 10: ");
        int num = scanner.nextInt();

        for(int i = 1; i <= num; i ++){ // i = 1 // 2 //

            for(int j = 1; j <= i; j++ ){ //j = 1; j == i//  i = 2 /
                System.out.print(i);//j  is not greater than i = 1
            }
            System.out.println();
        }
    }
}
// 1
//22
//