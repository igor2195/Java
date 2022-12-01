import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends BankAccount {
    public DepositAccount(double amount) {
        super(amount);
    }

    @Override
    public void take(double amount) {
        LocalDate now = LocalDate.now();
        if (now.until(super.lastIncome, ChronoUnit.MONTHS) == 0) {
            System.out.println("Нельзя снять деньги раньше чем через месяц, Последняя дата пополнеиня %s".formatted(super.lastIncome));
        } else {
            super.take(amount);
        }
    }
}
