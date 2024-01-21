package music;

public class Piano extends MusicalInstrument {

    private int keyCount;
    private String pedalType;

    @Override
    String play() {
        return "Piano is playing!";
    }

    @Override
    void tune() {
        System.out.println("Piano is being tuned!");
    }

    public int getKeyCount() {
        return keyCount;
    }

    public void setKeyCount(int keyCount) {
        this.keyCount = keyCount;
    }

    public String getPedalType() {
        return pedalType;
    }

    public void setPedalType(String pedalType) {
        this.pedalType = pedalType;
    }
}
