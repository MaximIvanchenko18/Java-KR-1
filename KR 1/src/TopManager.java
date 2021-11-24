public class TopManager extends Employee
{
    private final double bonus;

    public TopManager(Company company, double money_to_company, double fixed_salary)
    {
        super(company, money_to_company, fixed_salary);
        if (company.getIncome() > 10000000) bonus = fixed_salary * (150.0/100);
        else bonus = 0;
    }

    @Override
    public double getSalary()
    {
        return fixed_salary + bonus;
    }
}
