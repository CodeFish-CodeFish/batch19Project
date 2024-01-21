public class Transport {

    public String name;
    public int capacity;

    public Transport(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void start() {
        System.out.println(name + " is starting.");
    }

    protected void start(int time) {
        System.out.println(name + " is starting at " + time);
    }

    void stop() {
        System.out.println(name + " is stopping.");
    }
}
