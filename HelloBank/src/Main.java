public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(500);
        CheckingAccount checking = new CheckingAccount(1000);
        Transaction transaction = new Transaction(2.5);
        transaction.performTransaction(savings, 200, true); // Deposit 200 to savings
        transaction.performTransaction(checking, 150, false); // Withdraw 150 from checking
        System.out.println("Savings Account Balance: " + savings.getBalance());
        System.out.println("Checking Account Balance: " + checking.getBalance());
        System.out.println("Total Accounts: " + Bank.getTotalAccounts());
    }
}