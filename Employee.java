public class Employee {
    private int age;
    private String name, role; 

    public Employee(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRole(){
        return role;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Role: " + role + ", Age: " + age;
    }

}