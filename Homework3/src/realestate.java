public class realestate {

    private double area;
    private int noOfRoom;
    private String neighborhood;
    private double price;

    public realestate(double area, int noOfRoom, String neighborhood, double price) {
        this.area = area;
        this.noOfRoom = noOfRoom;
        this.neighborhood = neighborhood;
        this.price = price;
    }

    public void setArea(double area, int noOfRoom, String neighborhood, double price) {
        this.area = area;
        this.noOfRoom = noOfRoom;
        this.neighborhood = neighborhood;
        this.price = price;
    }

    public double getArea() {
        return area;
    }
    public int getNoOfRoom() {
        return noOfRoom;
    }
    public String getNeighborhood() {
        return neighborhood;
    }
    public double getPrice() {
        return price;
    }

    public void display() {

    }


}