public class RefillFactory {
    public Refill createRefill(String name) {
        if(name.equalsIgnoreCase("metal")) {
            return new MetalicRefill("Metal");
        } 
        else if(name.equalsIgnoreCase("sponge")) {
            return new SpongeRefill("Sponge");
        }
        return null;
    }
}