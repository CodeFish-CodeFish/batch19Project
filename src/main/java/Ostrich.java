public class Ostrich extends Bird{

    /*
            public void live(){
                sout("Bird is alive");
            }
     */

    @Override
    public boolean live(){
        System.out.println("Bird is present and alive!");
        return true;
    }

    @Override
    public void fly(){
        System.out.println("Ostrich is trying to fly");
        return false;
    }

    public static void main(String[] args) {
        Ostrich ostrich = new Ostrich();
        ostrich.live();
        ostrich.fly();
    }
}
