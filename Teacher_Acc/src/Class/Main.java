package Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Apartment Allocation System!");
        System.out.println("Choose an option:");
        System.out.println("1. Allocate Apartment for Permanent Faculty");
        System.out.println("2. Allocate Apartment for Lecturer");
        System.out.println("3. Allocate Apartment for Assistant Professor");
        System.out.println("4. Allocate Apartment for Associate Professor or Professor");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter teacher's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter teacher's ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter teacher's email: ");
        String email = scanner.nextLine();

        System.out.print("Enter teacher's phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter teacher's designation: ");
        String designation = scanner.nextLine();

        // Create a Teacher object
        Teacher teacher = new Teacher(name, id, email, phoneNumber, designation);

        // Allocate an apartment based on user choice
        Apartment allocatedApartment = null;
        switch (choice) {
            case 1:
                allocatedApartment = teacher.allocateApartment("101S", 2, 1200.0, 800.0);
                break;
            case 2:
                allocatedApartment = teacher.allocateApartment("102S", 1, 1000.0, 600.0);
                break;
            case 3:
                allocatedApartment = teacher.allocateApartment("103S", 2, 1500.0, 1000.0);
                break;
            case 4:
                allocatedApartment = teacher.allocateApartment("104S", 3, 2000.0, 1200.0);
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                System.exit(0);
        }

        // Display allocated apartment information
        allocatedApartment.showInfo();

        scanner.close();
    }
}

