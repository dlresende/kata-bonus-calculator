package net.diegolemos.bonuscalculator;

import org.junit.Test;

import static org.fest.assertions.Assertions.*;

public class SecretaryTest
{
    @Test
    public void should_compute_bonus_for_secretary()
    {
        Secretary patrick = new Secretary("Patrick", 130);

        double bonus = patrick.calculateBonus(50_000.00);

        assertThat(bonus).isEqualTo(50_000.00 * 1 / 100);
    }
}
