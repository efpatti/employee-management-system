import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        EmployeeManager manager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add employee");
            System.out.println("2. Remove employee");
            System.out.println("3. Search employee");
            System.out.println("4. List employees");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Role: ");
                    String role = scanner.nextLine();
                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    manager.addEmployee(new Employee(name, age, role));
                    System.out.println("Employee added.");
                }
                case 2 -> {
                    System.out.print("Enter name to remove: ");
                    String name = scanner.nextLine();
                    if (manager.removeEmployeeByName(name)) {
                        System.out.println("Employee removed.");
                    } else {
                        System.out.println("Employee not found");
                    }
                }
                case 3 -> {
                    System.out.print("Enter name to search: ");
                    String name = scanner.nextLine();
                    Employee found = manager.searchEmployeeByName(name);
                    if (found != null) {
                        System.out.println("Found: " + found);
                    } else {
                        System.out.println("Employee not found.");
                    }
                }
                case 4 -> manager.listEmployees();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.err.println("Invalid option.");
            }

        }
    }
}