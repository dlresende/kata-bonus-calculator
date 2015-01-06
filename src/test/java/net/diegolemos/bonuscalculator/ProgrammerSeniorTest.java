package net.diegolemos.bonuscalculator;

import org.junit.Test;

import static net.diegolemos.bonuscalculator.Bonus.PREMIUM;
import static org.fest.assertions.Assertions.assertThat;

public class ProgrammerSeniorTest
{
	private static final ProgrammerSenior SENIOR_PROGRAMMER = new ProgrammerSenior("Mike", true);
    
	@Test
    public void senior_programmers_should_have_premium_bonus()
    {
        assertThat(SENIOR_PROGRAMMER.bonus()).isEqualTo(PREMIUM);
    }
}
