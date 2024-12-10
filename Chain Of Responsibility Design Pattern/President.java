public class President extends LoanApprover {
  public President() {
   super();
  }

  public void ApproveLoan(Loan loan) {
    if(loan.amount >= 1000000){
      System.out.println("President approves loan");
    }
    else{
      this.nextApprover.ApproveLoan(loan);
    }
  }

}
