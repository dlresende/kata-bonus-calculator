package net.diegolemos;

import org.junit.Test;

import static org.fest.assertions.Assertions.*;

public class SecretaryTest
{
    @Test
    public void secretaries_have_1_percent_over_the_bonus_package()
    {
        Secretary patrick = new Secretary("Patrick");

        double bonus = patrick.calculateBonus(50_000.00);

        assertThat(bonus).isEqualTo(50_000.00 * 1 / 100);
    }
}
