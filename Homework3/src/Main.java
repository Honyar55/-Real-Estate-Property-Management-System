public class Main {
    public static void main(String[] args) {
        RealEstateAgency agency = new RealEstateAgency();

        villa villa = new villa(200, 5, "bakhtyari", 150000, false, 3);
        apartment apartment = new apartment(150, 5, "miran city", 100000, 10, true);
        furnishedapartment furnishedApartment = new furnishedapartment(400, 5, "ashti", 300000, 5, true, 2);

        agency.addProperty(villa);
        agency.addProperty(apartment);
        agency.addProperty(furnishedApartment);

        agency.displayAllProperties();

        agency.removeProperty(apartment);

        agency.displayAllProperties();
    }
}