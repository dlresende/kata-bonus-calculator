package net.diegolemos.bonuscalculation;

import org.junit.Test;

import static org.fest.assertions.Assertions.*;

public class ManagerTest
{
    @Test
    public void manager_have_8_5_percent_of_bonus()
    {
        Manager bob = new Manager("bob");

        double bonus = bob.calculateBonus(500_000.00);

        assertThat(bonus).isEqualTo(500_000.00 * 8.5 / 100);
    }
}
