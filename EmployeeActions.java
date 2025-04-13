public class EmployeeActions {
    private final EmployeeManager manager;
    private final ConsoleUI ui;

    public EmployeeActions(EmployeeManager manager, ConsoleUI ui) {
        this.manager = manager;
        this.ui = ui;
    }

    public void addEmployee() {
        String name = ui.prompt("Name: ");
        String role = ui.prompt("Role: ");
        int age = ui.promptInt("Age: ");

        manager.addEmployee(new Employee(name, age, role));
        ui.print("Employee added.");
    }

    public void removeEmployee() {
        String name = ui.prompt("Enter name to remove: ");
        if (manager.removeEmployeeByName(name)) {
            ui.print("Employee removed.");
        } else {
            ui.print("Employee not found.");
        }
    }

    public void searchEmployee() {
        String name = ui.prompt("Enter name to search: ");
        Employee found = manager.searchEmployeeByName(name);
        if (found != null) {
            ui.print("Found: " + found);
        } else {
            ui.print("Employee not found.");
        }
    }

    public void listEmployees() {
        manager.listEmployees();
    }
}