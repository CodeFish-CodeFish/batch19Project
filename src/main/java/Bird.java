public class Bird {

    public String name;
    public boolean canFly;
    public String herbewore;

    public boolean live(){
        System.out.println("Bird is present.");
        System.out.println("Bird is alive.");
        return true;
    }

    boolean fly(){
        System.out.println("Bird is flying!");
        System.out.println(canFly);
        return true;
    }

}
