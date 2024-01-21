public class Bird extends Animal implements Movable, Flyable {

    public String name;
    public boolean canFly;
    public String herbewore;

    public boolean live() {
        System.out.println("Bird is present.");
        System.out.println("Bird is alive.");
        return true;
    }

    @Override
    public void move() {
        System.out.println("Bird is moving!");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying!");
    }

    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.live();
        bird.move(); // are the methods that were enforced by interfaces ( Flyable, Movable )
        bird.live();

        Flyable bird1 = new Bird();
        bird1.fly();

        Flyable.stopFlying(); // static method that is coming from Flyable interface.

        /*
                TASK:

                * Create an interface called ElectronicDevice
                * Declare 3 methods (turnOn(), turnOff(), reset() )
                * Create 2 concrete classes ( tv, laptop )
                * Implement those 3 methods in your classes
         */
    }
}
