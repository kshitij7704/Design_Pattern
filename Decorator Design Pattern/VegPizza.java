public class VegPizza extends Pizza {
    VegPizza(String desc, double cost) {
        super(desc, cost);
    }

    @Override
    public String getDescription() {
        return this.desc;
    }

    @Override
    public double getCost() {
        return this.cost;
    }
}