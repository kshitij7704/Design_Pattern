public class Director extends LoanApprover {
  public Director() {
    super();
  }

  public void ApproveLoan(Loan loan) {
    if(loan.amount > 500000 && loan.amount < 1000000){
      System.out.println("Director approves loan");
    }
    else{
      this.nextApprover.ApproveLoan(loan);
    }
  }

}
