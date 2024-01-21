public class Eagle extends Bird{
    public String name;
    public boolean canFly;
    public String herbewore;

    @Override
    public boolean live(){
        System.out.println("Bird is present.");
        return false;
    }

    public static void main(String[] args) {
        Bird eagle = new Eagle();
    }
}
