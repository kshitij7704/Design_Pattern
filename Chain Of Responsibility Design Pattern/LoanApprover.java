public abstract class LoanApprover {
LoanApprover nextApprover;

  public LoanApprover() {

  }

  public void ApproveLoan(Loan loan) {
    if(nextApprover != null){
      nextApprover.ApproveLoan(loan);
    }
  }

  public void setNextApprover(LoanApprover nextApprover) {
    this.nextApprover = nextApprover;
  }

}
