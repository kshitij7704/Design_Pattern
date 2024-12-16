public class Cricket extends TemplateGame {
    Cricket() {

    }

    @Override
    public void startPlay() {
        System.out.println("Dhoni plays");
    }

    @Override
    public void endPlay() {
        System.out.println("Dhoni Wins");
    }

    @Override
    public void initilize(){
        super.initilize();
        System.out.println("Welcome to Cricket Game");
    }

}