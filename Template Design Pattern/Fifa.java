public class Fifa extends TemplateGame {
    Fifa() {

    }

    @Override
    public void startPlay() {
        System.out.println("Messi plays");
    }

    @Override
    public void endPlay() {
        System.out.println("Messi Wins");
    }

    @Override
    public void initilize() {
        super.initilize();
        System.out.println("Welcome to Fifa Game");
    }
    
}