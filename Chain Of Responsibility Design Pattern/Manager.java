public class Manager extends LoanApprover {
  public Manager() {
    super();
  }
  public void ApproveLoan(Loan loan) {
    if(loan.amount < 500000){
      System.out.println("Manager approves loan");
    }
    else{
      this.nextApprover.ApproveLoan(loan);
    }
  }

}
