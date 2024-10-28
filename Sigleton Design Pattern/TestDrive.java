public class TestDrive {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if(s1 == s2){
            System.err.println("Both s1 and s2 are same instance");
        }
    }
}
