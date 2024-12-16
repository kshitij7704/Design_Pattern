public abstract class TemplateGame {

    final public void play() { 
        open();
        initilize();
        startPlay();
        endPlay();
        close();
    }

    void open() {
        System.out.println("Game starts");
    }

    void initilize() {
        System.out.println("Welcome to Game");
    }

    void close() {
        System.out.println("Game closes");
    }

    abstract public void startPlay();
    abstract public void endPlay();
}