public class TestDrive {
    public static void main(String[] args) {
        // Chess
        Chess orgChess = new Chess("Chess", 8, new String[]{"Black", "White"});
        System.out.println("Original Chess Object:");
        orgChess.showDetails();

        Chess cloneChess = (Chess) orgChess.clone();
        System.out.println("Cloned Chess Object:");
        cloneChess.showDetails();

        cloneChess.setName("Modified Chess");
        cloneChess.setNumBox(10);
        cloneChess.setArr(new String[]{"Green", "White"});
        
        System.out.println("After modification: ");
        cloneChess.showDetails();

        // Tic Tac Toe
        TicTacToe orgTic = new TicTacToe("Tic Tac Toe", 3);
        System.out.println("Original Tic Tac Toe Object:");
        orgTic.showDetails();

        TicTacToe cloneTic = (TicTacToe) orgTic.clone();
        System.out.println("Cloned Tic Tac Toe Object:");
        cloneTic.showDetails();

        cloneTic.setName("Modified Tic Tac Toe");
        cloneTic.setNumBox(4);
        
        System.out.println("After modification: ");
        cloneTic.showDetails();
    }
}
