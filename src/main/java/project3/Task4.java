package project3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
 * Using scanner ask the user to enter 3 String words and print true if length of 3 string is
same and all of them contains the "java" and all of them starts with upper case any
letter.
For Example:
"I love java." -> length is 10
"We use java." -> length is 10
"Java is best" -> length is 10
Since all the sentences contain the java and start with upper case and length is the
same the output will be true.
Output:
true*/
        Scanner scanner = new Scanner(System.in);

        //first 3 words
        System.out.println("Please enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.println("Please enter the second string: ");
        String str2 = scanner.nextLine();

        System.out.println("Please enter the Third string: ");
        String str3 = scanner.nextLine();

//        "I love java."
//        "We use java."
//        "Java is best"

        boolean lengthOfAll = str1.length() == str2.length() && str2.length() == str3.length();

        System.out.println(lengthOfAll);

        boolean containsJava = str1.toLowerCase().contains("java") && str2.toLowerCase().contains("java") && str3.toLowerCase().contains("java");

        System.out.println(containsJava);

        boolean startWithUpperCase = Character.isUpperCase(str1.charAt(0)) && Character.isUpperCase(str2.charAt(0)) && Character.isUpperCase(str3.charAt(0));
        System.out.println("start with upper case ? " + startWithUpperCase);


        boolean isConditionMet = containsJava && lengthOfAll && startWithUpperCase;
        System.out.println("All condition are met to the requirements: " + isConditionMet);
    }
}
