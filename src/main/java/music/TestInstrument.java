package music;

public class TestInstrument {
    public static void main(String[] args) {

        Guitar acousticGuitar = new Guitar();

        acousticGuitar.setElectrical(false);
        acousticGuitar.setNumberOfStrings(5);
        acousticGuitar.tune();
        System.out.println(acousticGuitar.play());

        System.out.println("The number of strings: " + acousticGuitar.getNumberOfStrings());
        System.out.println("Is this guitar electrical? " + acousticGuitar.isElectrical());

        Piano fortepiano = new Piano();
        fortepiano.brand = "abc";

        fortepiano.setKeyCount(88);
        fortepiano.setPedalType("metallic pedal/s");

        System.out.println("The number of keys in this piano: " + fortepiano.getKeyCount());
        System.out.println("The pedal type of this piano: " + fortepiano.getPedalType());
    }
}
