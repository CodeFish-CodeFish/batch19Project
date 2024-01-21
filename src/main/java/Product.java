import java.util.*;

class Product {

    // Instance variables/fields/properties
    private String name;
    private double price;
    private ArrayList<String> reviews;
    private HashSet<String> categories;

    // Static variable/field/property
    private static String storeName = "QuickRetail";

    // Final variable/field/property -- we cannot modify/update/change the field once it is initialized
    private final int productId;

    // Constructor
    public Product(int productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;

        this.reviews = new ArrayList<>();
        this.categories = new HashSet<>();
    }

    // Constructor overloading
    public Product(int productId, String name, double price, HashSet<String> categories){
        this(productId, name, price);
        this.categories = categories;
    }

    // Instance methods
    public String getName(){
        return name;
    }

    public void addReview(String review){
        reviews.add(review);
    }

    public void updatePrice(double price){
        this.price = price;
    }

    // Method overloading
    public void updatePrice(double price, String reason){
        this.price = price;
        System.out.println("Price updated due to: " + reason);
    }

    // Static method
    public static String getStoreName(){
        return storeName;
    }

    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.printTemp();
    }
}
