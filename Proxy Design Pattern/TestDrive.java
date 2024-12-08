public class TestDrive {
    public static void main(String[] args) {
        Bank bank = new Bank("Harish", "123456789", 1000, "1234");
        ATM atm = new ATMProxy(bank);

        System.out.println();
        System.out.println("Correct Pin Example: ");
        atm.checkBalance("1234");
        System.out.println();
        atm.withdraw(200, "1234");

        System.out.println();
        System.out.println("Incorrect Pin Example: ");
        atm.checkBalance("4321");
        System.out.println();
        atm.withdraw(200, "4321");
    }
}