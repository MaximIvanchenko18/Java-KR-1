public class Operator extends Employee
{
    public Operator(Company company, double money_to_company, double fixed_salary)
    {
        super(company, money_to_company, fixed_salary);
    }

    @Override
    public double getSalary()
    {
        return fixed_salary;
    }
}
