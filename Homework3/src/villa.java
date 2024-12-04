public class villa extends realestate {
    private boolean spool;
    private int adjacentStreets;

    public villa(double area, int noOfRoom, String neighborhood, double price, boolean spool, int adjacentStreets) {
        super(area, noOfRoom, neighborhood, price);
        this.spool = spool;
        this.adjacentStreets = adjacentStreets;
    }

    public void setSpool(boolean spool, int adjacentStreets) {
        this.spool = spool;
        this.adjacentStreets = adjacentStreets;
    }

    public boolean getSpool() {
        return spool;
    }

    public int getAdjacentStreets() {
        return adjacentStreets;
    }

    @Override
    public void display() {
        System.out.println("property information:\nproperty type:villa\narea:" + getArea() +
            "\nnumber of rooms:" + getNoOfRoom() + "\nneighborhood:" + getNeighborhood() +
            "\nprice:" + getPrice() + "\nhas swimming pool ? " + getSpool() + "\nnumber od adjacent street:" + getAdjacentStreets());
    }
}