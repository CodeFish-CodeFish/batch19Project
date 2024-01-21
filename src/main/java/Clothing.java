public class Clothing {

    private String size;
    private String color;
    private String material;

    public Clothing(String size, String color, String material) {
        this.size = size;
        this.color = color;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Clothing size: " + size + " and color is: " + color + " and the material is: " + material;
    }

    public static void main(String[] args) {
        Clothing jeans = new Clothing("34", "blue", "denim");
        System.out.println(jeans);
    }

    /*
            IS-A and HAS-A relationship in JAVA --- it occurs when a class is extended by another class ( inheritance ).

            IS-A:
                * Represents an inheritance relationship between classes.
                * Achieved using "extends" keyword.
                * It is a unidirectional relationship ( a subclass is always a type of the superclass )

            HAS-A:
                * Represents a usage relationship between classes
                * Achieved by including an instance of one class as a field in another class.
                * It's a more flexible approach that promotes code re-usability.
     */
}
