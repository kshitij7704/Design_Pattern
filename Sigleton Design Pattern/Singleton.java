public final class Singleton {
    private static final  Singleton s = new Singleton();

    private Singleton(){
        System.err.println("Singleton Object Created");
    }

    public static Singleton getInstance(){
        return s;
    }
}
