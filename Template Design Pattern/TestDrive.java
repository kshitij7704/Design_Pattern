public class TestDrive {
    public static void main(String[] args) {
        TemplateGame cricket = new Cricket();
        TemplateGame fifa = new Fifa();

        cricket.play();
        System.out.println();
        fifa.play();
    }
}