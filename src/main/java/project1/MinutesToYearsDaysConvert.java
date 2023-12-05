package project1;

public class MinutesToYearsDaysConvert {
    public static void main(String[] args) {

        long totalMinutes = 3456789; // total min

        long minutesInYear = 60 * 24 * 365; //525600 minutes in the year
        System.out.println(minutesInYear + " minutesInYear");

        long years = totalMinutes/minutesInYear; // 6
//        System.out.println("Years " + years);



        long remindMinutes = totalMinutes % minutesInYear;  //6 whole years left over minutes// 303189
        System.out.println("remindMinutes " + remindMinutes);

        int days =  (int) remindMinutes / ( 60 * 24 ); // 60 * 24 is minutes in the one day

        System.out.println("The total minutes 3456789 has a " + years +" and " + days + " days");
        System.out.println("modulus");
        System.out.println(10 % 3);//  10 - 3 - 3 -3 -1
    }
}
