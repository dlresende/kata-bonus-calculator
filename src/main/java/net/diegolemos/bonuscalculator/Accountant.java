package net.diegolemos.bonuscalculator;

import java.util.Set;

import static java.lang.String.format;
import static java.lang.System.out;

public class Accountant
{
    private final Set<Employee> employees;

    public Accountant(Set<Employee> employees)
    {
        this.employees = employees;
    }

    public double payEveryone(double turnover)
    {
        log("Turnover: $ %.2f.", turnover);

        double leftover = turnover;

        for(Employee employee : employees)
        {
            double employeeBonus = employee.calculateBonus(turnover);
            leftover -= employeeBonus;

            if(employeeBonus > 0.0)
                log("Yeah! %s received $ %.2f.", employee.getName(), employeeBonus);
            else
                log("Oops! %s does not have bonus.", employee.getName());
        }

        log("Leftover: $ %.2f.", leftover);

        return leftover;
    }

    private void log(String message, Object... params)
    {
        out.println(format(message, params));
    }
}
