package net.diegolemos.bonuscalculator;

import static java.lang.String.format;

public class BonusCalculator
{
    public double calculateLeftover(double turnover, Employee... employees) {
        print("Turnover: $ %.2f.", turnover);
        double bonuses = sumBonuses(turnover, employees);
        double leftover = turnover - bonuses;
        print("Leftover: $ %.2f.", leftover);
		return leftover;   
    }


    private double sumBonuses(double turnover, Employee... employees) {
		double bonuses = 0.0;

        for(Employee employee : employees)
        {
            bonuses += calculateBonus(turnover, employee);
        }
        
		return bonuses;
	}


	private double calculateBonus(double turnover, Employee employee) {
		double employeeBonus = employee.calculateBonus(turnover);

		if(employeeBonus > 0.0)
			print("Yeah! %s got payed $ %.2f.", employee, employeeBonus);
		else
		    print("Oops! %s does not have bonus.", employee);
		
		return employeeBonus;
	}

	private void print(String template, Object... values) {
		System.out.println(format(template, values));
	}
}
