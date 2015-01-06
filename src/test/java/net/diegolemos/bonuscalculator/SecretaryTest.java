package net.diegolemos.bonuscalculator;

import org.junit.Test;

import static net.diegolemos.bonuscalculator.Bonus.BASE;
import static org.fest.assertions.Assertions.*;

public class SecretaryTest
{
	private static final Secretary SECRETARY = new Secretary("Patrick", 130);

	@Test
    public void secretary_should_have_base_bonus()
    {
        assertThat(SECRETARY.bonus()).isEqualTo(BASE);
    }
}
