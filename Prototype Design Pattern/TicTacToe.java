public class TicTacToe implements Prototype {
    private String name;
    private int numBox;

    TicTacToe(){
        
    }
    TicTacToe(String name, int numBox){
        this.name = name;
        this.numBox = numBox;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setNumBox(int numBox){
        this.numBox = numBox;
    }
    public String getName(){
        return this.name;
    }
    public int getNumBox(){
        return this.numBox;
    }

    @Override
    public Prototype clone(){
        return new TicTacToe(name, numBox);
    }

    @Override
    public void showDetails(){
        System.out.println("Name: " + name);
        System.out.println("Number of Box: " + numBox);
        System.out.println();
    }
}
