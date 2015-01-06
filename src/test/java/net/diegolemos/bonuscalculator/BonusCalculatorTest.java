package net.diegolemos.bonuscalculator;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class BonusCalculatorTest
{
    private static final Secretary MARIE = new Secretary("Marie", 130);
    private static final Employee JOHN = new Employee("John");
    private static final Manager SARA = new Manager("Sara", 10);
	private static final ProgrammerSenior ELIZABETH = new ProgrammerSenior("Elisabeth", true);
	private static final ProgrammerJunior BILLY = new ProgrammerJunior("Billy", false);
	private static final ProgrammerJunior JOE = new ProgrammerJunior("Joe", true);
	
	@Test
    public void should_pay_all_employees_and_calculate_the_leftover()
    {
        BonusCalculator calculator = new BonusCalculator();

        double leftover = calculator.calculateLeftover(100_000.00, JOHN, SARA, JOE, BILLY, ELIZABETH, MARIE);

        assertThat(leftover).isEqualTo(100_000.00 * (1 - ((2 * 8.5 + 2 * 2.27 + 2 * 1) / 100)));
    }
}
