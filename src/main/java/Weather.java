public class Weather {
    private int temperature;

    public void printTemp(){
        System.out.println("The current temp is " + temperature);
    }

    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.temperature = -28;
    }
}
