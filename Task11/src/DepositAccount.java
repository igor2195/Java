import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends BankAccount {

    private final LocalDate now = LocalDate.now();

    public DepositAccount(double amount) {
        super(amount);
    }

    @Override
    public void take(double amount) {
        if (now.until(super.lastIncome, ChronoUnit.MONTHS) == 0) {
            System.out.println("Нельзя снять деньги раньше чем через месяц, Последняя дата пополнеиня " + super.lastIncome );
        } else {
            super.take(amount);
        }


    }
}
