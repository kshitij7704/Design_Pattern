public class CircleFactory implements Factory {
    @Override
    public Shape factoryMethod() {
        return new Circle();
    }
}