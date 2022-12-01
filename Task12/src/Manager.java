public class Manager implements Employee {
    private static final int SALARY = 30000;
    private static final double FIX_BONUS = 0.05;
    private final int income;

    public Manager() {
        this.income = (int) (Math.random() * (140000 - 115000) + 115000);
    }

    /**
     * Manager — зарплата складывается из фиксированной части и бонуса в виде 5% от заработанных для компании денег.
     *
     * @return
     */
    @Override
    public Integer getMonthSalary() {
        return SALARY + (int) (income * FIX_BONUS);
    }
}


