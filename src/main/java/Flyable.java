public interface Flyable {
    void fly();

    static void stopFlying() {
        System.out.println("Stopped flying!");
    }

    // default methods, were introduced in JAVA 8
    // interface can only contain final and static variables.

}
