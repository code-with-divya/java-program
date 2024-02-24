
import java.util.Scanner;

public class divya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter the number of employees
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Array to store employee names
        String[] employeeNames = new String[numEmployees];

        // Prompting the user to enter employee names
        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Enter the name of employee " + (i + 1) + ": ");
            employeeNames[i] = scanner.nextLine();
        }

        // Displaying employee names whose names start with 'A'
        System.out.println("\nEmployees whose names start with 'A':");
        for (String name : employeeNames) {
            if (name.charAt(0) == 'A') {
                System.out.println(name);
            }
        }
    }
}

