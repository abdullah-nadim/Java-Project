package Class;

class DoubleSizeFamilyRoom extends Apartment {
    private int numberOfBathrooms;

    // Constructor
    public DoubleSizeFamilyRoom(String roomNumber, int numberOfBeds, double rent, double size, Teacher teacher, int numberOfBathrooms) {
        super(roomNumber, numberOfBeds, rent, size, teacher);
        this.numberOfBathrooms = numberOfBathrooms;
    }
}
