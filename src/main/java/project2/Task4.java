package project2;

public class Task4 {
    public static void main(String[] args) {

        // to avoid rounding issues we consider every number 100 times bigger.
        // then in the output we will divide to 100 again to get real number
        int totalCost = 110;
        int ball  = (totalCost - 100) / 2;

        System.out.println((double ) ball/100);
    }
}
