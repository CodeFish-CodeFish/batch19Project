public class TransportPractice {
    public static void main(String[] args) {

        Train train = new Train("Railroad train", 3000, 20);
        Ship ship = new Ship("Liner", 10000, 8000, 20);
        Plane plane = new Plane("Boeing 747 - Cargo", 5000, 25000);

        train.blowHorn();
        ship.getTonnage();
        plane.getMaxAltitude();
    }
}
