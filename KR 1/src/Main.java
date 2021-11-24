import java.util.ArrayList;

public class Main
{
    public static double rand(int min, int max)
    {
        return min + (Math.random() * max);
    }

    public static void main(String[] args)
    {
        final double managers_fixed = 60000;
        final double top_managers_fixed = 80000;
        final double operators_fixed = 40000;
        Company my_company = new Company();

        // Найм сотрудников
        for (int i = 0; i < 180; ++i)
            my_company.hire(new Operator(my_company, rand(115000, 140000), operators_fixed));
        for (int i = 0; i < 80; ++i)
            my_company.hire(new Manager(my_company, rand(125000, 170000), managers_fixed));
        for (int i = 0; i < 10; ++i)
            my_company.hire(new TopManager(my_company, rand(150000, 200000), top_managers_fixed));

        // Информация о зарплатах
        ArrayList<Employee> employees_with_salaries;
        System.out.println(12 + " самых высоких зарплат:");
        employees_with_salaries = my_company.getTopSalaryStaff(12);
        for (Employee employee : employees_with_salaries)
            System.out.println(employee.getSalary() + " рублей");
        System.out.println();
        System.out.println(30 + " самых низких зарплат:");
        employees_with_salaries = my_company.getLowestSalaryStaff(30);
        for (Employee employee : employees_with_salaries)
            System.out.println(employee.getSalary() + " рублей");
        System.out.println();
        // Увольнение
        int staff_number = my_company.getStaffNumber();
        for (int i = 0; i < staff_number/2; ++i)
            my_company.fire(0);
        // Информация о зарплатах
        System.out.println(12 + " самых высоких зарплат:");
        employees_with_salaries = my_company.getTopSalaryStaff(12);
        for (Employee employee : employees_with_salaries)
            System.out.println(employee.getSalary() + " рублей");
        System.out.println();
        System.out.println(30 + " самых низких зарплат:");
        employees_with_salaries = my_company.getLowestSalaryStaff(30);
        for (Employee employee : employees_with_salaries)
            System.out.println(employee.getSalary() + " рублей");
    }
}
