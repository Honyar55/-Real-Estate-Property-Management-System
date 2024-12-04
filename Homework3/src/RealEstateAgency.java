import java.util.ArrayList;

public class RealEstateAgency {
    private ArrayList < realestate > properties;
    private final int MAX_PROPERTIES = 100;

    public RealEstateAgency() {
        properties = new ArrayList < > (MAX_PROPERTIES);
    }


    public void addProperty(realestate property) {
        if (properties.size() < MAX_PROPERTIES) {
            properties.add(property);
        
        } else {
            System.out.println("Cannot add more properties. Maximum limit reached.");
        }
    }


    public void removeProperty(realestate property) {
        if (properties.remove(property)) {
            System.out.println("Property removed successfully.");
        } else {
            System.out.println("Property not found.");
        }
    }


    public void displayAllProperties() {
        if (properties.isEmpty()) {
            System.out.println("No properties available.");
        } else {
            for (realestate property: properties) {
                property.display();
                System.out.println("------------------------------------");
            }
        }
    }
}