public class LeafEmployee implements Employee {
    private String name;
    private String role;
    private double salary;

    public LeafEmployee(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String getDetails() {
        return role + ": " + name + ", Salary: " + salary;
    }
}