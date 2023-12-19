package Project5Loops;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i< input.length(); i++){

            char currentChar = input.charAt(i); // result = "";

//            if(Character.isUpperCase(currentChar)){
//                result.append(" ");
//            }

            if(input.charAt(i)>=65 && input.charAt(i) <=90){
                result.append(" ");
            }
            result.append(currentChar);
        }
        System.out.println(result.toString().trim());
    }
}
