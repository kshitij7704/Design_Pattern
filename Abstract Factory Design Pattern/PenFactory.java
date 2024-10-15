public class PenFactory {
    public Pen createPen(String type) {
        BodyFactory bd = new BodyFactory();
        RefillFactory rf = new RefillFactory();
        if(type.equalsIgnoreCase("gel")) {
            return new Gel(bd.createBody("wooden"), rf.createRefill("metal"));
        } 
        else if(type.equalsIgnoreCase("sketch")) {
            return new Sketch(bd.createBody("plastic"), rf.createRefill("sponge"));
        }
        return null;
    }
}