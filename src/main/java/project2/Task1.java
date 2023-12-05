package project2;

public class Task1 {
    public static void main(String[] args) {
        int number = 578432;

        int digit1 = number / 100000 % 10;
        int digit2 = number / 10000 % 10;
        int digit3 = number / 1000 % 10;
        int digit4 = number / 100 % 10;
        int digit5 = number / 10 % 10;
        int digit6 = number / 1 % 10;
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);
        System.out.println(digit6);

        int multiplication = digit1;
        multiplication *= digit2;
        multiplication *= digit3;
        multiplication *= digit4;
        multiplication *= digit5;
        multiplication *= digit6;
        System.out.println(multiplication);

        int sum = digit1;
        sum += digit2;
        sum += digit3;
        sum += digit4;
        sum += digit5;
        sum += digit6;
        System.out.println(sum);

    }
}
