public class TestDrive {
    public static void main(String[] args) {
        Pizza pizza1 = new Mushroom(new Capsicum(new Tomato(new VegPizza("Veg Pizza", 200.0))));
        System.out.println(pizza1.getDescription());
        System.out.println(pizza1.getCost());

        System.out.println();

        Pizza pizza2 = new Mushroom(new Chicken(new NonVegPizza("Non-Veg Pizza", 250.0)));
        System.out.println(pizza2.getDescription());
        System.out.println(pizza2.getCost());
    }
}