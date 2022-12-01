import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company newCompany = new Company();
        //Нанимаем сотрудников
        hireEmployees(newCompany);
        //Выводим список из 10-15 самых высоких зп в компании
        getTopSalary(newCompany, 10);
        //Выводим список из самых ниских ЗП
        getLowSalary(newCompany, 30);
        //Уволить 50% сотрудников
        fireHalfEmployee(newCompany);
        //Выводим список из 10-15 самых высоких зп в компании
        getTopSalary(newCompany, 10);
        //Выводим список из самых ниских ЗП
        getLowSalary(newCompany, 30);
    }

    /**
     * Удалении половины сотрудников из компаннии
     *
     * @param newCompany Компания с сотрудниками
     */
    private static void fireHalfEmployee(Company newCompany) {
        for (int i = 0; i < newCompany.getEmployeeCount() / 2; i++) {
            int index = (int) Math.random() * newCompany.getEmployeeCount();
            newCompany.fire(newCompany.getEmployees().get(index));
        }
        System.out.printf("Было удалено %s сотрудников %n", newCompany.getEmployeeCount() / 2);
    }

    /**
     * Добавляет в company сотрудников
     *
     * @param company Компания с сотрудниками
     */
    public static void hireEmployees(Company company) {
        for (int i = 0; i < 180; i++) {
            Employee operator = new Operator();
            company.hire(operator);
        }
        for (int i = 0; i < 80; i++) {
            Employee manager = new Manager();
            company.hire(manager);
        }
        for (int i = 0; i < 10; i++) {
            Employee topManager = new TopManager();
            company.hire(topManager);
        }
    }

    /**
     * Метод возвращает указанное с count кол-во сотрудников с самой низкой ЗП
     *
     * @param company Компания с сотрудниками
     * @param count   кол-во возвращаемых сотрудников
     */
    public static void getLowSalary(Company company, int count) {
        System.out.println("Самые низские зарплаты :");
        for (Employee employee : company.getLowestSalaryStaff(count)) {
            System.out.println(employee.getMonthSalary());
        }
    }

    /**
     * Метод возвращает указанное с count кол-во сотрудников с самой высокой ЗП
     *
     * @param company Компания с сотрудниками
     * @param count   кол-во возвращаемых сотрудников
     */
    public static void getTopSalary(Company company, int count) {
        System.out.println("Самые высокие зарплаты :");
        for (Employee employee : company.getTopSalaryStaff(10)) {
            System.out.println(employee.getMonthSalary());
        }
    }
}