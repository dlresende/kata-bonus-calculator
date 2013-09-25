package net.diegolemos.bonuscalculator;

import org.junit.Test;

import static org.fest.assertions.Assertions.*;

public class JuniorProgrammerTest
{
    @Test
    public void bonus_should_be_2_27_percent_of_the_bonus_package_for_junior_programmers()
    {
        JuniorProgrammer joe = new JuniorProgrammer("Joe");

        double bonus = joe.calculateBonus(1_000_000.00);

        assertThat(bonus).isEqualTo(1_000_000.00 * 2.27 / 100);
    }
}
