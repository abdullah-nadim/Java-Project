package Class;

public class BasicAmenitiesApartment extends Apartment {
    private boolean hasBalcony;


    public BasicAmenitiesApartment(String roomNumber, int numberOfBeds, double rent, double size, Teacher teacher, boolean hasBalcony) {
        super(roomNumber, numberOfBeds, rent, size, teacher);
        this.hasBalcony = hasBalcony;
    }


    public void showInfo() {
        super.showInfo();
        System.out.println("Has Balcony: " + hasBalcony);
    }
}