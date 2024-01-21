import java.sql.SQLOutput;
import java.util.*;

public class HashMapPractice {
    public static void main(String[] args) {

        /*
                HashMap - is a part of Java Collections framework.
                It stores the data in KEY - VALUE pairs format.

                KEY POINTS:

                * Implements "Map" interface
                * Stores the data as a key-value pair. Each key-value pair is called an entry.
                * Uses "hashing" mechanism to determine where to store the entry in the hashmap
                * NULL values: only one (single) null is allowed for KEY, and multiple null values are allowed for VALUE
                * Ordering: order is not guaranteed, it is unordered
                * It has 16 as a default capacity, and load factor is 0.75
                (load factor is a measure of how full the hashmap should be before it automatically increases the capacity)
                * important point: not allowed to have a duplicate KEY.
                        If you try to insert an entry with duplicate key, it will replace the existing key-value pair (entry) with the new value.

                * HashMap is not synchronized
                * Iteration in hashmap could be done using keySet(), values(), and entrySet() methods.

                {
                [ key1 - abc ],
                [ key2 - jkl ],
                [ key3 - qrt ]
                }

         */

        // Syntax of creating a hashmap: HashMap<Key, Value> variableName = new HashMap<>();

        HashMap<String, Integer> hashMap = new HashMap<>();

        // Setting the capacity

        HashMap<Double, String> hashMap1 = new HashMap<>(30);

        // Setting the capacity and load factor (float)

        HashMap<String, String> hashMap2 = new HashMap<>(25, 0.85f);

        // Using another HashMap

        HashMap<Integer, Integer> hashMap3 = new HashMap<>();
        HashMap<Integer, Integer> hashMap4 = new HashMap<>(hashMap3);


        /*
                HashMap methods
         */

        // put(Key k, Value v) -- adds a key-value pair to the hashmap

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Sunday", -29);
        //map.put(20, "Saturday"); will not work as data types do not match

        /*
                TASK: create a hashmap of your choice, add 3 entries
         */

        HashMap<String, String> map1 = new HashMap<>();
        map1.put("Illinois", "Chicago");
        map1.put("California", "Los Angeles");
        map1.put("Texas", "Houston");

        // get(Object key) -- returns the value to which the specified key is mapped

        //get("Illinois") ---> "Chicago"

        String value1 = map1.get("Illinois"); // Chicago
        String value2 = map1.get("California"); // Los Angeles
        String value3 = map1.get("Texas"); // Houston

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);

        //System.out.println(map1.get("Chicago").length()); // NULL POINTER EXCEPTION

        // remove(Object key) -- removes the entry for the specified key from this map if present

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("England", "London");
        map2.put("Russia", "Moscow");
        map2.put("Poland", "Warsaw");

        map2.remove("Russia"); // it should remove the specified entry from the hashmap

        System.out.println(map2);

        /*
                TASK:

                1. Use scanner to get the 5 products and their prices

                    for example:

                        Please enter the product?
                        "Apple iPhone 15"
                        Please enter the price for this product?
                        1200

               2. Use put() to put the product in hashmap
               3. Calculate the total price of all 5 products

               4. (optional) ask user to enter the product they want to remove and remove using remove() method
               5. (optional) print out the update hashmap

               6. (optional) ask user to enter the amount of certain product they wish to buy

                    for example: 3 items of product 4.
                        you need to get the price of the product 4 and multiply it by 3 and print out the total
         */

/*
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> productsAndPricesMap = new HashMap<>();
        String[] productsArray = new String[3];

        double totalPriceOfProducts = 0.0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter the product " + i + ":");
            String productName = scanner.nextLine();
            System.out.println("Please enter the product " + i + " price:");
            double productPrice = scanner.nextDouble();
            scanner.nextLine();

            productsAndPricesMap.put(productName, productPrice);

            productsArray[i] = productName;
        }

        for (String productName : productsArray) {
            totalPriceOfProducts += (productsAndPricesMap.get(productName)); // adding each and every price of  mapped products to the total
        }

        System.out.println("The total of all 3 products is: " + totalPriceOfProducts);

        System.out.println("Please enter the product you wish to remove: ");
        productsAndPricesMap.remove(scanner.nextLine());

        System.out.println("The updated hashmap is: " + productsAndPricesMap);

        System.out.println("Please choose the product you wish to purchase: ");
        String productToPurchase = scanner.nextLine();

        System.out.println("Please enter the amount of the " + productToPurchase + " you wish to purchase: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        double totalPriceForAmount = productsAndPricesMap.get(productToPurchase) * amount;

        System.out.println("Your total price for " + amount + " of " + productToPurchase + " is " + totalPriceForAmount);



        */


        // containsKey(Object key) -- returns "true" if this hashmap contains an entry (mapping) for the specified key

        HashMap<String, Integer> map3 = new HashMap<>();
        map3.put("Camry", 40);
        map3.put("Civic", 60);
        map3.put("Model Y", 0);

        System.out.println(map3.containsKey("Camry")); // true
        System.out.println(map3.containsKey("honda")); // false

        // containsValue(Object value) -- returns "true" if this hashmap contains one or more keys to the specified value

        HashMap<String, String> map4 = new HashMap<>();
        map4.put("Apple", "Green");
        map4.put("Tomato", "Red");
        map4.put("Avocado", "Green");

        System.out.println(map4.containsValue("Red")); // true
        System.out.println(map4.containsValue("Purple")); // false

        // size() -- returns the total number of key-value pairs in the hashmap

        HashMap<String, String> map5 = new HashMap<>();
        map5.put("Apple", "Green");
        map5.put("Tomato", "Red");
        map5.put("Avocado", "Green");

        System.out.println(map5.size()); // 3

        HashMap<Integer, Integer> map6 = new HashMap<>();
        System.out.println(map6.size()); // 0

        // isEmpty() -- returns "true" if this hashmap contains no key-value pairs

        HashMap<String, String> map7 = new HashMap<>();
        System.out.println(map7.isEmpty()); // true because the hashmap is empty

        map7.put("Chicago", "Illinois");
        System.out.println(map7.isEmpty()); // false

        // clear() -- removes all the entries in this hashmap

        HashMap<String, String> map8 = new HashMap<>();
        map8.put("new york", "knicks");
        map8.put("chicago", "bulls");

        map8.clear(); // removes every pair in the hashmap
        System.out.println(map8.isEmpty()); // true

        // keySet() -- returns a set containing all keys of this hashmap

        HashMap<String, Integer> map9 = new HashMap<>();
        map9.put("apple", 5);
        map9.put("banana", 8);
        map9.put("watermelon", 2);

        Set<String> keys = map9.keySet();
        System.out.println(keys);

        // values() -- returns a "collection" of all values in this hashmap

        HashMap<String, String> map10 = new HashMap<>();
        map10.put("Chelsea", "London");
        map10.put("Bayern Munich", "Munich");
        map10.put("Inter", "Milan");

        Collection<String> values = map10.values();

        System.out.println(values);

        // entrySet() -- returns a "set" of the key-value pairs of this hashmap

        HashMap<String, String> map11 = new HashMap<>();
        map11.put("Football", "Today");
        map11.put("Basketball", "Tomorrow");
        map11.put("Volleyball", "Next week");

        Set<Map.Entry<String, String>> entries = map11.entrySet();

        for (Map.Entry<String, String> entry : map11.entrySet()) {
            if (entry.getValue().equals("Next week")) {
                System.out.println(entry.getKey());
            }
        }

        // iterate thru the keys

        System.out.println("----------");

        for (String key : map11.keySet()) {
            System.out.println(key.toUpperCase());
        }

        System.out.println("----------");

        // iterate thru the values

        for (String value : map11.values()) {
            System.out.println(value.substring(0, 3).toUpperCase());
        }

        // replace(Key k, Value v) -- replaces the entry in this hashmap only if it is currently exists in this hashmap

        HashMap<String, Integer> rates = new HashMap<>();
        rates.put("Bank of America", 3);
        rates.put("JP Morgan Chase", 2);
        rates.put("Wells Fargo", 5);

        System.out.println(rates);

        rates.replace("Wells Fargo", 6);

        System.out.println(rates);

        rates.replace("JP Morgan Chase", 2, 7); // overloaded method that shows the values
        System.out.println(rates);

        // putAll(Map map) -- copies all the entries from the specified hashmap to this hashmap

        HashMap<String, Double> menu = new HashMap<>();
        menu.put("Steak", 39.00);
        menu.put("Mushroom soup", 12.50);
        menu.put("Ice cream", 8.99);
        menu.put("Pancakes", 11.99);

        HashMap<String, Double> breakfastMenu = new HashMap<>();
        breakfastMenu.put("Pancakes", 12.99);
        breakfastMenu.put("Scrambled eggs", 13.50);

        menu.putAll(breakfastMenu); // adds all entries from breakfast menu to menu

        System.out.println(menu);

        // getOrDefault(Object key, V defaultValue) -- returns the value of the specified key,
        //                          or "defaultValue" if this hashmap contains no entry for that key

        double price = menu.getOrDefault("Sushi", 8.99);
        //double price1 = menu.get("Sushi"); //

        System.out.println(price);
        //System.out.println(price1);

        HashMap<String, String> carsAndPrices = new HashMap<>();
        carsAndPrices.put("toyota", "15K");
        carsAndPrices.put("honda", "16K");

        System.out.println(carsAndPrices.getOrDefault("bmw", "no bmw in this dealership"));

        // replaceAll(function) -- replaces each entry's value with the result of applying the function

        HashMap<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("John Doe", 75);
        studentGrades.put("Jane Doe", 95);
        studentGrades.put("Alex Smith", 85);

        studentGrades.replaceAll((key, value) -> value - 5);

        System.out.println(studentGrades);

        /*
                TASK:

                * Create a hashmap of string, double
                * You need at least 5 entries ( key-value pairs )
                * Apply 10% discount to all the values in your hashmap ( use replaceAll() )

                hint: value - (value * 0.1)
         */

        HashMap<String, Double> pricelist = new HashMap<>();
        pricelist.put("Car", 15999.99);
        pricelist.put("Bike", 7850.50);
        pricelist.put("Boat", 18450.99);

        pricelist.replaceAll((key, value) -> (double) (Math.round(value - (value * 0.1))));

        System.out.println(pricelist);

        // Math.round

    }
}
