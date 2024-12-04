public class apartment extends realestate {
    private int floor;
    private boolean parking;

    public void setFloor(int floor, boolean parking) {
        this.floor = floor;
        this.parking = parking;
    }
    public apartment(double area, int noOfRoom, String neighborhood, double price, int floor, boolean parking) {
        super(area, noOfRoom, neighborhood, price);
        this.floor = floor;
        this.parking = parking;
    }
    public int getFloor() {
        return floor;
    }
    public boolean getParking() {
        return parking;
    }

    @Override
    public void display() {
        System.out.println("property information:\nproperty type:villa\narea:" + getArea() +
            "\nnumber of rooms:" + getNoOfRoom() + "\nneighborhood:" + getNeighborhood() +
            "\nprice:" + getPrice() + "\nfloor number:" + getFloor() + "\nhas parking lot ? " + getParking());
    }


}