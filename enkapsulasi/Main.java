package enkapsulasi;

public class Main {
    public static void main(String[] args) {
        BankAccount joyadaOkomoto = new BankAccount(100);

        joyadaOkomoto.withdraw(10);
        System.out.println("Current balance is: " + joyadaOkomoto.getBalance());
    }
}
