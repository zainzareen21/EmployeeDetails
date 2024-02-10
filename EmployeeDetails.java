import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter date of joining (YYYY-MM-DD): ");
        String dateOfJoining = scanner.nextLine();

        System.out.print("Enter department ID: ");
        int departmentId = scanner.nextInt();

        // Display the entered details
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employeeName);
        System.out.println("Date of Joining: " + dateOfJoining);
        System.out.println("Department ID: " + departmentId);

        scanner.close();
    }
}