public class Train extends Transport {

    int numberOfCarriages;

    public Train(String name, int capacity, int numberOfCarriages) {
        super(name, capacity); // parent constructor is called.
        this.numberOfCarriages = numberOfCarriages;
    }

    public void blowHorn() {
        super.start(); // parent method is called.
        System.out.println(super.capacity + " is a capacity."); // parent variable is accessed.
        System.out.println(name + " blows its horn!");
    }

    @Override
    public void start(){
        super.start();
        System.out.println("Train is moving!");
    }

    @Override
    public void stop(){
        System.out.println("Train is stopping!");
    }

    public static void main(String[] args) {
        Train train = new Train("Speed train", 3000, 20);
        train.blowHorn();
    }
}
