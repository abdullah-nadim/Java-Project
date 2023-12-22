package Class;

class Apartment {
    private String roomNumber;
    private int numberOfBeds;
    private double rent;
    private double size;
    private Teacher teacher;

    // Constructor
    public Apartment(String roomNumber, int numberOfBeds, double rent, double size, Teacher teacher) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.rent = rent;
        this.size = size;
        this.teacher = teacher;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void showInfo() {
        System.out.println("\nApartment Information:");
        System.out.println("Room Number: " + getRoomNumber());
        System.out.println("Number of Beds: " + getNumberOfBeds());
        System.out.println("Rent: $" + getRent());
        System.out.println("Size: " + getSize() + " sq.ft");
        
        // Display teacher information
        if (teacher != null) {
            teacher.showInfo();
        }
    }
}
