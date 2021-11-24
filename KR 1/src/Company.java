import java.util.ArrayList;

public class Company
{
    private ArrayList<Employee> employees;
    private double income;

    public Company()
    {
        employees = new ArrayList<Employee>();
        income = 0;
    }

    public void hire(Employee employee)
    {
        employees.add(employee);
        income += employee.getMoney_To_Company();
    }
    public void hireAll(ArrayList<Employee> employees)
    {
        for (Employee employee : employees)
            this.hire(employee);
    }
    public void fire(Employee employee)
    {
        income -= employee.getMoney_To_Company();
        employees.remove(employee);
    }
    public void fire(int index)
    {
        income -= employees.get(index).getMoney_To_Company();
        employees.remove(index);
    }
    public double getIncome()
    {
        return income;
    }
    public int getStaffNumber()
    {
        return employees.size();
    }

    public ArrayList<Employee> getTopSalaryStaff(int count)
    {
        ArrayList<Employee> employees_copy = (ArrayList<Employee>) employees.clone();
        ArrayList<Employee> result = new ArrayList<Employee>();
        int cnt = 0;
        Employee employee_max_salary;
        while (cnt < count)
        {
            employee_max_salary = employees_copy.get(0);
            for (Employee employee : employees_copy)
            {
                if (employee.getSalary() > employee_max_salary.getSalary())
                    employee_max_salary = employee;
            }
            result.add(employee_max_salary);
            employees_copy.remove(employee_max_salary);
            cnt++;
        }
        return result;
    }
    public ArrayList<Employee> getLowestSalaryStaff(int count)
    {
        ArrayList<Employee> employees_copy = (ArrayList<Employee>) employees.clone();
        ArrayList<Employee> result = new ArrayList<Employee>();
        int cnt = 0;
        Employee employee_min_salary;
        while (cnt < count)
        {
            employee_min_salary = employees_copy.get(0);
            for (Employee employee : employees_copy)
            {
                if (employee.getSalary() < employee_min_salary.getSalary())
                    employee_min_salary = employee;
            }
            result.add(employee_min_salary);
            employees_copy.remove(employee_min_salary);
            cnt++;
        }
        return result;
    }
}
