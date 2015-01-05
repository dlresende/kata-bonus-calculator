package net.diegolemos.bonuscalculator;

import static java.lang.String.format;

import java.util.Set;

public class BonusCalculator
{
    private final Set<Employee> employees;

    public BonusCalculator(Set<Employee> employees)
    {
        this.employees = employees;
    }

    public double payEveryone(double turnover)
    {
        print("Turnover: $ %.2f.", turnover);
        double leftover = turnover;

        for(Employee employee : employees)
        {
            double employeeBonus = employee.calculateBonus(turnover);
            leftover -= employeeBonus;

            if(employeeBonus > 0.0)
            	print("Yeah! %s got payed $ %.2f.", employee, employeeBonus);
            else
                print("Oops! %s does not have bonus.", employee);
        }

        print("Leftover: $ %.2f.", leftover);

        return leftover;
    }

	private void print(String template, Object... values) {
		System.out.println(format(template, values));
	}
}
