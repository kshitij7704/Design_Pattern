public class TestDrive {
    public static void main(String[] args) {
        Employee marketingPerson1 = new LeafEmployee("John", "Marketing Person", 3000.0);
        Employee marketingPerson2 = new LeafEmployee("Alice", "Marketing Person", 3200.0);
        Employee clerk1 = new LeafEmployee("Mark", "Clerk", 2000.0);
        Employee productionEngineer1 = new LeafEmployee("James", "Production Engineer", 4000.0);
        Employee productionEngineer2 = new LeafEmployee("Emily", "Production Engineer", 4200.0);
        Employee clerk2 = new LeafEmployee("Anna", "Clerk", 2100.0);

        HierarchyEmployee salesManager = new HierarchyEmployee("Robert", "Sales Manager", 5000.0);
        HierarchyEmployee productionManager = new HierarchyEmployee("Michael", "Production Manager", 6000.0);

        salesManager.addSubordinate(marketingPerson1);
        salesManager.addSubordinate(marketingPerson2);
        salesManager.addSubordinate(clerk1);

        productionManager.addSubordinate(clerk2);
        productionManager.addSubordinate(productionEngineer1);
        productionManager.addSubordinate(productionEngineer2);

        HierarchyEmployee ceo = new HierarchyEmployee("Susan", "CEO", 10000.0);
        ceo.addSubordinate(salesManager);
        ceo.addSubordinate(productionManager);

        System.out.println("Single Employee Details:");
        System.out.println(marketingPerson1.getDetails());

        System.out.println("\nHierarchy Details:");
        System.out.println(ceo.getDetails());

        System.out.println("Total Salary of the Team under CEO: " + ceo.getSalary());
        System.out.println("Total Salary of the Team under Sales Manager: " + salesManager.getSalary());
        System.out.println("Total Salary of the Team under Production Manager: " + productionManager.getSalary());
    }
}