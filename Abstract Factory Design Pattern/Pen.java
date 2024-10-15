public abstract class Pen {
    private Body bd;
    private Refill rf;

    Pen(Body bd, Refill rf) {
        this.bd = bd;
        this.rf = rf;
    }

    public Body getBd() {
        return bd;
    }

    public Refill getRf() {
        return rf;
    }

    public void setBd(Body bd) {
        this.bd = bd;
    }

    public void setRf(Refill rf) {
        this.rf = rf;
    }

    public abstract void write();
}