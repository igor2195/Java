import java.util.*;

public class Company {
    private final List<Employee> employee = new ArrayList<>();

    public List<Employee> getTopSalaryStaff(int count) {
        employee.sort(Comparator.comparing(Employee::getMonthSalary).reversed());
        return employee.subList(0, count);
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        employee.sort(Comparator.comparing(Employee::getMonthSalary));
        return employee.subList(0, count);
    }

    public void hire(Employee employee) {
        this.employee.add(employee);
    }

    public void hireAll(Collection<Employee> employees) {
        this.employee.addAll(employees);
    }

    public void fire(Employee employee) {
        this.employee.remove(employee);
    }

    public static double getIncome() {
        return 15000000;
    }

    public Integer getEmployeeCount() {
        return employee.size();
    }

    public List<Employee> getEmployees() {
        return employee;
    }
}
