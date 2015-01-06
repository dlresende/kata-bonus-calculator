package net.diegolemos.bonuscalculator;

import org.junit.Test;

import static net.diegolemos.bonuscalculator.Bonus.PLUS;
import static org.fest.assertions.Assertions.assertThat;

public class ProgrammerJuniorTest
{
	private static final ProgrammerJunior JUNIOR_PROGRAMMER = new ProgrammerJunior("Joe", false);

	@Test
    public void junior_programmers_should_have_plus_bonus()
    {
        assertThat(JUNIOR_PROGRAMMER.bonus()).isEqualTo(PLUS);
    }
}
