public class Mushroom extends PizzaDecorator {
    Mushroom(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Topping: Mushroom";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 7.0;
    }
}