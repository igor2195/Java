public class Operator implements Employee {
    private static final int SALARY = 3000;

    /**
     * зарплата складывается только из фиксированной части
     *
     * @return
     */
    @Override
    public Integer getMonthSalary() {
        return SALARY;
    }
}
