package in.kgcoding.challenge78;

public class Customer {
    static void main() {
        BankAccount account = new BankAccount("001","Rohan");
        account.depositMoney(100);
        account.withdrawMoney(200);
        account.depositMoney(-40);
        account.withdrawMoney(-35);
        account.withdrawMoney(0);

    }
}
