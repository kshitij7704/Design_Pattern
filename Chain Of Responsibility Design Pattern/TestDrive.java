public class TestDrive {
  public static void main(String[] args) {
    LoanApprover manager = new Manager();
    LoanApprover director = new Director();
    LoanApprover president = new President();

    manager.setNextApprover(director);
    director.setNextApprover(president);
    president.setNextApprover(null);
    
    Loan loan = new Loan(700000);
    manager.ApproveLoan(loan);
  }
}
