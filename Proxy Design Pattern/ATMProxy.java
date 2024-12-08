public class ATMProxy implements ATM {
    private Bank bank;

    ATMProxy(Bank bank){
        this.bank = bank;
    }

    @Override
    public void withdraw(double amount, String pin){
        if(bank.checkPin(pin)){
            bank.withdraw(amount, pin);
        } 
        else{
            System.out.println("Invalid Pin.");
        }
    }

    @Override
    public void checkBalance(String pin){
        if(bank.checkPin(pin)){
            bank.checkBalance(pin);
        } 
        else{
            System.out.println("Invalid Pin.");
        }
    }
}