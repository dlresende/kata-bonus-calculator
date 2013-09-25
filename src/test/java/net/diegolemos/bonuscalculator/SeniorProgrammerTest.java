package net.diegolemos.bonuscalculator;

import org.junit.Test;

import static org.fest.assertions.Assertions.*;

public class SeniorProgrammerTest
{
    @Test
    public void bonus_should_be_5_32_percent_of_the_bonus_package_for_senior_programmers()
    {
        SeniorProgrammer mike = new SeniorProgrammer("Mike");

        double bonus = mike.calculateBonus(500_000.00);

        assertThat(bonus).isEqualTo(500_000.00 * 5.32 / 100);
    }
}
