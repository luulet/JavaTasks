public class BankAccount {
    // Your variable declarations and code here

    private int money;
    private int accountNumber;

    private static int totalAccounts = 0;
    private static int nextAccountNumber = 0;

    BankAccount() {
        int money = 0;
    }
    BankAccount(int money) {
        this.money = money;
        this.accountNumber = nextAccountNumber++;
        totalAccounts ++;
    }
    public void deposit(int i) {
        money += i;
    }

    public void withdraw(int i) {
        money -= i;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return money;
    }
    int count = 0;

    public int getTotalAccounts() {
        return totalAccounts;
    }


    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}