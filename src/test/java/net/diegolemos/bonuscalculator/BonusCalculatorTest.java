package net.diegolemos.bonuscalculator;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static net.diegolemos.bonuscalculator.Programmer.Level.JUNIOR;
import static net.diegolemos.bonuscalculator.Programmer.Level.SENIOR;
import static org.fest.assertions.Assertions.assertThat;

public class BonusCalculatorTest
{
    @Test
    public void should_pay_everyone()
    {
        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee("John"));
        employees.add(new Manager("Sara"));
        employees.add(new Programmer("Joe", JUNIOR));
        employees.add(new Programmer("Billy", JUNIOR));
        employees.add(new Programmer("Elisabeth", SENIOR));
        employees.add(new Secretary("Marie"));
        BonusCalculator bonusCalculator = new BonusCalculator(employees);

        double leftover = bonusCalculator.payEveryone(100_000.00);

        assertThat(leftover).isEqualTo(100_000.00 * (1 - ((8.5 + 2 * 2.27 + 5.32 + 1) / 100)));
    }
}
