public class TestDrive {
    public static void main(String[] args) {
        TV sonyTV = new SonyTV();
        TV phillipsTV = new PhillipsTV();

        AbstractRemote sonyRemote = new Remote("Sony Remote", sonyTV);
        AbstractRemote phillipsRemote = new Remote("Phillips Remote", phillipsTV);

        sonyRemote.on();
        sonyRemote.off();
        phillipsRemote.on();
        phillipsRemote.off();
    }
}
