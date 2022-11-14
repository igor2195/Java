public class CardAccount extends BankAccount {

    private final double COMMISSION_RATE = 0.01;

    public CardAccount(double amount) {
        super(amount);
    }

    @Override
    public void take(double amount) {
        double commission = amount * COMMISSION_RATE;
        super.take(amount + commission);
        System.out.println("Сумма снятия вместе с комиссией: %s".formatted(amount + commission));
    }
}
