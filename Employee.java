public class Employee {
    private static int nextId = 1;
    private final int id;
    private String name, role;
    private int age;

    public Employee(String name, int age, String role) {
        this.id = nextId++;
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Role: " + role + ", Age: " + age;
    }
}