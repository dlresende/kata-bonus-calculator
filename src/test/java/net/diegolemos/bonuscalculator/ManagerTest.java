package net.diegolemos.bonuscalculator;

import org.junit.Test;

import static net.diegolemos.bonuscalculator.Bonus.PREMIUM;
import static org.fest.assertions.Assertions.*;

public class ManagerTest
{
	private static final Manager MANAGER = new Manager("bob", 10);

	@Test
    public void manager_have_premium_bonus()
    {
        assertThat(MANAGER.bonus()).isEqualTo(PREMIUM);
    }
}
