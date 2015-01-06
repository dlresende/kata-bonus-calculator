package net.diegolemos.bonuscalculator;

import org.junit.Test;

import static net.diegolemos.bonuscalculator.Bonus.BASE;
import static org.fest.assertions.Assertions.*;

public class EmployeeTest
{
	private static final Employee EMPLOYEE = new Employee("John");

	@Test
    public void employee_should_have_base_bonus()
    {
        assertThat(EMPLOYEE.bonus()).isEqualTo(BASE);
    }
}
