public class RectangleFactory implements Factory {
    @Override
    public Shape factoryMethod() {
        return new Rectangle();
    }
}