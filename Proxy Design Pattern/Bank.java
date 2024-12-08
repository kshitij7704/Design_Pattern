public class Bank implements ATM {
    private String cname;
    private double balance;
    private String acno;
    private String pin;

    Bank(String cname, String acno, double balance, String pin){
        this.cname = cname;
        this.acno = acno;
        this.balance = balance;
        this.pin = pin;
    }

    public void setCname(String cname){
        this.cname = cname;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setAcno(String acno){
        this.acno = acno;
    }
    public void setPin(String pin){
        this.pin = pin;
    }
    public String getCname(){
        return this.cname;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getAcno(){
        return this.acno;
    }
    public String getPin(){
        return this.pin;
    }

    public boolean checkPin(String pin){
        if(pin.equals(this.pin)){
            return true;
        }
        else{
            return false;
        }
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println(amount + " is added to your account");
        System.out.println("Total balance: " + this.balance);
    }

    @Override
    public void checkBalance(String pin){
        if(checkPin(pin)){
            System.out.println("Customer name: " + this.cname);
            System.out.println("Account no: " + this.acno);
            System.out.println("Current balance: " + this.balance);
        }
        else{
            System.out.println("Invalid Pin");
        }
    }

    @Override
    public void withdraw(double amount, String pin){
        if(checkPin(pin)){
            if (amount > balance){
                System.out.println("Insufficient funds");
            } 
            else{
                balance -= amount;
                System.out.println("Withdrawal successful, " + amount + " Removed." + "\nRemaining balance: " + balance);
            }
        }
        else{
            System.out.println("Invalid Pin");
        }
    }
}