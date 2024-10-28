public abstract class Pizza {
    public String desc;
    public double cost;

    Pizza(String desc, double cost) {
        this.desc = desc;
        this.cost = cost;
    }

    public abstract String getDescription();
    public abstract double getCost();
}