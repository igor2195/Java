public class Main {

    public static void main(String[] args) {
        BankAccount account = new DepositAccount(1000);
        account.put(200);
        System.out.println(account.getAmount());
        account.take(100);
        System.out.println(account.getAmount());
    }
}
