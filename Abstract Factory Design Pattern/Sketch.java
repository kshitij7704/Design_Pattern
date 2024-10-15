public class Sketch extends Pen {
    Sketch(Body bd, Refill rf) {
        super(bd, rf);
    }

    @Override
    public void write() {
        System.out.println("Writing with sketch pen, which is made up of " + getBd().getType() + " body and has " + getRf().getType() + " refill.");
    }
}