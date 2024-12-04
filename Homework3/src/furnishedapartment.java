public class furnishedapartment extends apartment {
    private int furniturequality;

    public furnishedapartment(double area, int noOfRoom, String neighborhood, double price, int floor, boolean parking, int furnitureQuality) {
        super(area, noOfRoom, neighborhood, price, floor, parking);
        this.furniturequality = furnitureQuality;
    }

    public int getFurnitureQuality() {
        return furniturequality;
    }

    public void setFurnitureQuality(int furnitureQuality) {
        this.furniturequality = furnitureQuality;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Furniture quality:" + getFurnitureQuality());
    }
}