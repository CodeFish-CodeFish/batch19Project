public class Plane extends Transport {

    private int maxAltitude;

    public int getMaxAltitude() {
        return maxAltitude;
    }

    public void takeOff() {
        System.out.println("Plane " + name + "is taking off.");
    }

    public void land() {
        System.out.println("Plane " + name + "is landing.");
    }

    public Plane(String name, int capacity, int maxAltitude) {
        super(name, capacity);
        this.maxAltitude = maxAltitude;
    }
}
