import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HashMapReview {



    public static void main(String[] args) {

        /*
        PLAN:

        1. Review
        2. Practice as a team by creating a custom class
        3. Blocks, access modifiers

                REVIEW:

            HashMap - key-value (no duplicates for keys, should be unique) (values can be duplicate)

            HashMap<key, value> variableName = new HashMap<>();

                * No order
                * Unique keys
                * Null values (1 null is allowed for keys, multiple nulls for values)
                * Constant-time performance
                * Default capacity of hashmap - 16, default load factor - 0.75

                METHODS:
                map.get(key);
                map.put(key, value);

         */

        HashMap<String, String> accountManagement = new HashMap<>();

        accountManagement.put("John Doe", "johndoe1@mail.com");
        accountManagement.put("John Doe", "janedoe1@mail.com"); // this will update the pair with the new value
        accountManagement.put("Adam Smith", "adamSmith1@mail.com");
        accountManagement.put("Edgar Poe", null);
        accountManagement.put(null, "No info");
        accountManagement.put(null, "Not a valid info");

        System.out.println(accountManagement.size());
        System.out.println(accountManagement.get("Edgar Poe"));

        System.out.println(accountManagement.get(null));

        // genre/section -- key, collection of books -- value
        HashMap<String, ArrayList<String>> library = new HashMap<>();

        // 1st
        library.put("Sci Fi", new ArrayList<>(Arrays.asList("Lord of the Rings", "Harry Potter")));

        // 2nd
        library.get("Sci Fi").add("Star Wars");

        System.out.println(library);

        // type of engine -- key, value -- make and model of vehicles

        // password management: login info -- key, password -- value

        // URL or website info -- key, Hashmap (login as a key, password as a value)

        HashMap<String, HashMap<String, String>> passwordManagementSystem = new HashMap<>();

        passwordManagementSystem.put("www.netflix.com", addLoginCredentials("johnDoe1@mail.com", "password123!"));
        passwordManagementSystem.put("www.amazon.com", addLoginCredentials("john123_doe", "Password123@"));

        // DRY - do not repeat yourself

    }

    /*
            - login id (2)
            - password (3)
            - URL/website info (1)
     */
    public static HashMap<String, String> addLoginCredentials(String loginId, String password) {
        HashMap<String, String> credentials = new HashMap<>();
        credentials.put(loginId, password);
        return credentials;
    }
}
