public class Ship extends Transport {

    private int tonnage;
    public int numberOfCrew;

    public Ship(String name, int capacity, int tonnage, int numberOfCrew) {
        super(name, capacity);
        this.tonnage = tonnage;
        this.numberOfCrew = numberOfCrew;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void anchor() {
        System.out.println("Ship " + name + " has been anchored.");
    }
}
