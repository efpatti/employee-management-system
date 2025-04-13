import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    public List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public boolean removeEmployeeByName(String name) {
        return employees.removeIf(e -> e.getName().equalsIgnoreCase(name));
    }

    public Employee searchEmployeeByName(String name) {
        for (Employee e: employees) {
            if (e.getName().equalsIgnoreCase(name)) {
                return e;
            }
        }
        return null;
    }

    public void listEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee e: employees) {
                System.out.println(e);
            }
        }
    }

}