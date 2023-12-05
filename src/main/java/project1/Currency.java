package project1;

public class Currency {

    public static void main(String[] args) {

        int uah = 34000;

        double convertRate = 0.028;

        double usdAmount = uah * convertRate;

        System.out.println("The 1000 Grivna in dollars " + usdAmount);

    }

}
