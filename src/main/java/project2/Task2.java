package project2;

public class Task2 {
    public static void main(String[] args) {
        int number = 53876;

        int digit1 = number / 10000 % 10;
        int digit2 = number / 1000 % 10;
        int digit3 = number / 100 % 10;
        int digit4 = number / 10 % 10;
        int digit5 = number % 10;

        System.out.println(digit5);
        System.out.println(digit4);
        System.out.println(digit3);
        System.out.println(digit2);
        System.out.println(digit1);

        int total = (digit5 * 10000) + (digit4 * 1000) + (digit3 * 100) + (digit2 * 10) + digit1;

        System.out.println("The total number is: " + total); //67835


    }
}
