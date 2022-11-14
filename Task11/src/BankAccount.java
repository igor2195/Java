import java.time.LocalDate;

public class BankAccount {
    private double balance;
    protected LocalDate lastIncome;

    public BankAccount(double amount) {
        this.balance = amount;
    }

    public double getAmount() {
        return balance;
    }

    public void put(double amount) {
        if (amount < 0) {
            System.out.println("Введена отрицатлеьная сумма");
        } else {
            balance += amount;
            lastIncome = LocalDate.of(2022, 11, 5);
        }
    }

    public void take(double amount) {
        if (amount > balance) {
            System.out.println("Сумма снятия превышает баланс");
        } else balance -= amount;
    }
}
