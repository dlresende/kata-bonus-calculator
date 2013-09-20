package net.diegolemos.bonuscalculation;

import org.junit.Test;

import static net.diegolemos.bonuscalculation.Programmer.Level.*;
import static org.fest.assertions.Assertions.*;

public class ProgrammerTest
{
    @Test
    public void bonus_should_be_2_27_percent_of_the_bonus_package_for_junior_programmers()
    {
        Programmer joe = new Programmer("Joe", JUNIOR);

        double bonus = joe.calculateBonus(1_000_000.00);

        assertThat(bonus).isEqualTo(1_000_000.00 * 2.27 / 100);
    }

    @Test
    public void bonus_should_be_5_32_percent_of_the_bonus_package_for_senior_programmers()
    {
        Programmer mike = new Programmer("Mike", SENIOR);

        double bonus = mike.calculateBonus(500_000.00);

        assertThat(bonus).isEqualTo(500_000.00 * 5.32 / 100);
    }

    @Test
    public void test_equality()
    {
        assertThat(new Programmer("Joe", JUNIOR)).isEqualTo(new Programmer("Joe", JUNIOR));
        assertThat(new Programmer("Mike", JUNIOR)).isNotEqualTo(new Programmer("Joe", JUNIOR));
        assertThat(new Programmer("Mike", SENIOR)).isNotEqualTo(new Programmer("Mike", JUNIOR));
        assertThat(new Programmer("Mike", JUNIOR)).isNotEqualTo(new Programmer("Joe", SENIOR));
        assertThat(new Programmer("Joe", JUNIOR)).isNotEqualTo(new Object());
    }
}
