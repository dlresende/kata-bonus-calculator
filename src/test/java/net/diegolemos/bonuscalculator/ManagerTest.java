package net.diegolemos.bonuscalculator;

import org.junit.Test;

import static org.fest.assertions.Assertions.*;

public class ManagerTest
{
    @Test
    public void should_compute_bonus_for_manager()
    {
        Manager bob = new Manager("bob", 10);

        double bonus = bob.calculateBonus(500_000.00);

        assertThat(bonus).isEqualTo(500_000.00 * 8.5 / 100);
    }
}
