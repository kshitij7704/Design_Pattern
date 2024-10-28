public class Capsicum extends PizzaDecorator {
    Capsicum(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Topping: Capsicum";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 5.0;
    }
}