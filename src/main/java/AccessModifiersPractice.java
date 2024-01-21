public class AccessModifiersPractice {

    public int age; // the least restrictive one
    String fullName;
    protected double price;
    private float loadFactor; // the most restrictive one

    /*
           Access modifier in Java is a keyword using which we can set the accessibility of classes,
           constructors, methods and other members.

           Encapsulation is achieved using access modifier/s. [private]

           1. public -- the member (class, constructor, method, variable) can be accessible from any other class in the project.

           2. package-private or default (no access modifier is defined) -- the member is accessible only within the same package.

           3. protected -- the member is accessible within the same package and subclasses (child class) in other packages.

           4. private -- the member is accessible only within the class its declared.

           ORDER OF ACCESSIBILITY: public -> protected -> package-private/default -> private
     */

    public static void main(String[] args) {
        Product product = new Product(101, "phone", 2.99);
    }
}
