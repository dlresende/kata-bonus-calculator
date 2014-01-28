package net.diegolemos.bonuscalculator;

import org.junit.Test;

import static org.fest.assertions.Assertions.*;

public class EmployeeTest
{
    @Test
    public void should_compute_bonus_for_employee()
    {
        Employee john = new Employee("John");

        double bonus = john.calculateBonus(1_000_000.00);

        assertThat(bonus).isZero();
    }
}
