public class Chicken extends PizzaDecorator {
    Chicken(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Topping: Chicken";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 15.0;
    }
}