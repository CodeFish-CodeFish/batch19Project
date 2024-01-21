package music;

public class Guitar extends MusicalInstrument{

    private int numberOfStrings;
    private boolean isElectrical;

    @Override
    String play() {
        return "Guitar is playing!";
    }

    @Override
    void tune() {
        System.out.println("Guitar is being tuned!");
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public boolean isElectrical() {
        return isElectrical;
    }

    public void setElectrical(boolean electrical) {
        isElectrical = electrical;
    }
}
