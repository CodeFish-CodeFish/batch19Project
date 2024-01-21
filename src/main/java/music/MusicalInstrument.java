package music;

public abstract class MusicalInstrument {

    // instance variables
    String type;
    String material;
    String brand;

    //  abstract methods
    abstract String play();

    abstract void tune();

    public void makeSound() {
        System.out.println("Musical instrument is making a sound!");
    }

}
