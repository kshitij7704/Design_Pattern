public class Chess implements Prototype {
    private String name;
    private int numBox;
    private String boxColors[];

    Chess(){

    }
    Chess(String name, int numBox, String boxColors[]){
        this.name = name;
        this.numBox = numBox;
        this.boxColors = boxColors;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setNumBox(int numBox){
        this.numBox = numBox;
    }
    public void setArr(String boxColors[]){
        this.boxColors = boxColors;
    }
    public String getName(){
        return this.name;
    }
    public int getNumBox(){
        return this.numBox;
    }
    public String[] getArr(){
        return this.boxColors;
    }

    @Override
    public Prototype clone(){
        if(this.boxColors != null){
            String[] colorCopy = new String[boxColors.length];
            for(int i=0;i<boxColors.length;i++){
                colorCopy[i] = boxColors[i];
            }
            return new Chess(name, numBox, colorCopy);
        }
        else{
            return new Chess(name, numBox, null);
        }
    }

    @Override
    public void showDetails(){
        System.out.println("Name: " + name);
        System.out.println("Number of Box: " + numBox);
        if(boxColors != null){
            System.out.print("Board Color: ");
            for(String i : boxColors){
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println();
        }
        else{
            System.out.println("Board Color: null");
        }
    }
}
