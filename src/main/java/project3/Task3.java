package project3;

public class Task3 {
    public static void main(String[] args) {
//        Please use method chaining for the following Strings. Methods are provided next to the
//        String.
//        String “ Snicker “; —> trim, toUpperCase, substring and charAt methods
//        String “Cookie” —> toLowerCase, replace ‘o’ with ‘u’, concat with ’s’, starts with ‘C’
        String first = " Snicker ";
        String second = "Cookie";
        System.out.println("The first word:-" + first.trim().toUpperCase().substring(5).charAt(1));
        System.out.println("The second word: "+ second.toLowerCase().replace("o","u").concat("s").startsWith("C"));
    }
}
