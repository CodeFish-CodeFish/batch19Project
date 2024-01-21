public class Building {

    public String type;
    private String address;
    private double numberOfRooms;


    public void setType(String type) {
        this.type = type;
    }

    public void setAddress(String address) {
        if(address == null){
            System.out.println("NULL is not a valid input.");
            return;
        }
        this.address = address;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getNumberOfRooms() {
        return numberOfRooms;
    }
}
