package net.diegolemos.bonuscalculator;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.fest.assertions.Assertions.assertThat;

public class AccountantTest
{
    @Test
    public void should_pay_everyone()
    {
        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee("John"));
        employees.add(new Manager("Sara"));
        employees.add(new ProgrammerJunior("Joe"));
        employees.add(new ProgrammerJunior("Billy"));
        employees.add(new ProgrammerSenior("Elisabeth"));
        employees.add(new Secretary("Marie"));
        Accountant accountant = new Accountant(employees);

        double leftover = accountant.payEveryone(100_000.00);

        assertThat(leftover).isEqualTo(100_000.00 * (1 - ((8.5 + 2 * 2.27 + 5.32 + 1) / 100)));
    }
}
