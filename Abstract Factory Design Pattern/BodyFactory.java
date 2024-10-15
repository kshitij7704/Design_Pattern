public class BodyFactory {
    public Body createBody(String name) {
        if(name.equalsIgnoreCase("wooden")) {
            return new WoodenBody("Wooden");
        } 
        else if(name.equalsIgnoreCase("plastic")) {
            return new PlasticBody("Plastic");
        }
        return null;
    }
}