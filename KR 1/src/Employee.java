public class Employee
{
    protected Company company;
    protected double money_to_company;
    protected double fixed_salary;

    public Employee(Company company, double money_to_company, double fixed_salary)
    {
        this.company = company;
        this.money_to_company = money_to_company;
        this.fixed_salary = fixed_salary;
    }

    public double getMoney_To_Company()
    {
        return money_to_company;
    }
    public double getSalary()
    {
        return fixed_salary;
    }
}
