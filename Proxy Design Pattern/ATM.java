public interface ATM {
    void checkBalance(String pin);
    void withdraw(double amount, String pin);
}