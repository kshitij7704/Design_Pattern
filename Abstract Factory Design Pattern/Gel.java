public class Gel extends Pen {
    Gel(Body bd, Refill rf) {
        super(bd, rf);
    }

    @Override
    public void write() {
        System.out.println("Writing with Gel pen, which is made up of " + getBd().getType() + " body and has " + getRf().getType() + " refill.");
    }
}