public class Manager extends Employee
{
    private final double bonus;

    public Manager(Company company, double money_to_company, double fixed_salary)
    {
        super(company, money_to_company, fixed_salary);
        bonus = money_to_company*(5.0/100);
    }

    @Override
    public double getSalary()
    {
        return fixed_salary + bonus;
    }
}
