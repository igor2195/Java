public class TopManager implements Employee {
    private static final int SALARY = 100000;
    private static final double FIX_BONUS = 1.5;

    /**
     * зарплата складывается из фиксированной части и бонуса в виде 150% от заработной платы, если доход компании более 10 млн рублей.
     *
     * @return
     */
    @Override
    public Integer getMonthSalary() {
        return Company.getIncome() > 10000000 ? (int) (SALARY * FIX_BONUS) : SALARY;
    }
}