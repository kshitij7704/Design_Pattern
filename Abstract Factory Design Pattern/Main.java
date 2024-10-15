public class Main {
    public static void main(String[] args) {
        PenFactory penFactory = new PenFactory();
        Pen gel = penFactory.createPen("gel");
        Pen sketch = penFactory.createPen("sketch");

        gel.write();
        sketch.write();
    }
}