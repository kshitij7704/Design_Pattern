public class Tomato extends PizzaDecorator {
    Tomato(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Topping: Tomato";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 4.0;
    }
}