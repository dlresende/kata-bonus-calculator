package net.diegolemos.bonuscalculator;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class ProgrammerSeniorTest
{
    @Test
    public void should_compute_bonus_for_senior_programmers()
    {
        ProgrammerSenior mike = new ProgrammerSenior("Mike", true);

        double bonus = mike.calculateBonus(500_000.00);

        assertThat(bonus).isEqualTo(500_000.00 * 5.32 / 100);
    }
}
