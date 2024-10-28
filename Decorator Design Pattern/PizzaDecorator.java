public abstract class PizzaDecorator extends Pizza {
    public Pizza pizza;

    PizzaDecorator(Pizza pizza) {
        super(pizza.getDescription(), pizza.getCost());
        this.pizza = pizza;
    }

    @Override
    public abstract String getDescription();
}