public class CardAccount extends BankAccount {

    public CardAccount(double amount) {
        super(amount);
    }

    @Override
    public void take(double amount) {
        double commission = amount * 0.01;
        super.take(amount + commission);
        System.out.println("Сумма снятия вместе с комиссией: " + (amount + commission));
    }
}
