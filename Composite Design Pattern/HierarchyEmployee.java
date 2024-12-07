import java.util.ArrayList;

public class HierarchyEmployee implements Employee {
    private String name;
    private String role;
    private double salary;
    private ArrayList<Employee> subordinates;

    public HierarchyEmployee(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    public void removeSubordinate(Employee employee) {
        subordinates.remove(employee);
    }

    public double getTeamSalary() {
        double totalSalary = salary;
        for (Employee subordinate : subordinates) {
            totalSalary += subordinate.getSalary();
        }
        return totalSalary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String getDetails() {
        StringBuilder details = new StringBuilder(role + ": " + name + ", Salary: " + salary + "\n");
        for (Employee subordinate : subordinates) {
            details.append("\t").append(subordinate.getDetails()).append("\n");
        }
        return details.toString();
    }
}