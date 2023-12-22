package Class;

public class Teacher {
    private String name;
    private int id;
    private String email;
    private String phoneNumber;
    private String designation;

    // Constructor
    public Teacher(String name, int id, String email, String phoneNumber, String designation) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.designation = designation;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // ... (unchanged)
    public Apartment allocateApartment(String roomNumber, int numberOfBeds, double rent, double size) {
        String teacherDesignation = this.getDesignation().toLowerCase();

        if (teacherDesignation.equals("permanent faculty")) {
            return new DoubleSizeFamilyRoom(roomNumber, numberOfBeds, rent, size, this, 2);
        } else 
        if (teacherDesignation.equals("lecturer")) {
            return new BasicAmenitiesApartment(roomNumber, numberOfBeds, rent, size, this, true);
        } else if (teacherDesignation.equals("assistant professor")) {
            return new NormalAmenitiesApartment(roomNumber, numberOfBeds, rent, size, this, true);
        } else if (teacherDesignation.equals("associate professor") || teacherDesignation.equals("professor")) {
            return new DoubleSizeFamilyRoom(roomNumber, numberOfBeds, rent, size, this, 3);
        } else {
            // Default to BasicAmenitiesApartment if the designation is not recognized
            return new BasicAmenitiesApartment(roomNumber, numberOfBeds, rent, size, this, false);
        }
    }
}
    // Method to display teacher information
    public void showInfo() {
        System.out.println("\nTeacher Information:");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Designation: " + getDesignation());
    }
}