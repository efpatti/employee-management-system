import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsoleUI ui = new ConsoleUI(scanner);
        EmployeeManager manager = new EmployeeManager();
        EmployeeActions actions = new EmployeeActions(manager, ui);

        while (true) {
            ui.print("\nEmployee Management System");
            ui.print("1. Add employee");
            ui.print("2. Remove employee");
            ui.print("3. Search employee");
            ui.print("4. List employees");
            ui.print("5. Exit");
            int option = ui.promptInt("Choose an option: ");

            switch (option) {
                case 1 -> actions.addEmployee();
                case 2 -> actions.removeEmployee();
                case 3 -> actions.searchEmployee();
                case 4 -> actions.listEmployees();
                case 5 -> {
                    ui.print("Exiting...");
                    scanner.close();
                    return;
                }
                default -> ui.print("Invalid option.");
            }
        }
    }
}