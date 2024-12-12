public class TestDrive {
    public static void main(String[] args) {
        Orignator o1 = new Orignator("Initial content\n");
        CareTaker c1 = new CareTaker();

        o1.write("Additional content\n");
        c1.addMemento(o1.createMemento());

        o1.write("More content\n");
        c1.addMemento(o1.createMemento());

        o1.restoreFromMemento(c1.getMemento(1));

        System.out.println(o1.getContent());
    }
}