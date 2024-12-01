public class TestDrive {
    public static void main(String[] args) {
        Factory f1 = new CircleFactory();
        Shape s = f1.factoryMethod();
        s.display();

        Factory f2 = new RectangleFactory();
        Shape s2 = f2.factoryMethod();
        s2.display();
    }
}
