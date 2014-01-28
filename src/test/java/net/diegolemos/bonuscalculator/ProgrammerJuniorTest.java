package net.diegolemos.bonuscalculator;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class ProgrammerJuniorTest
{
    @Test
    public void should_compute_bonus_for_junior_programmers()
    {
        ProgrammerJunior joe = new ProgrammerJunior("Joe", false);

        double bonus = joe.calculateBonus(1_000_000.00);

        assertThat(bonus).isEqualTo(1_000_000.00 * 2.27 / 100);
    }
}
