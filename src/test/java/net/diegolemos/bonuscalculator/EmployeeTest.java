package net.diegolemos.bonuscalculator;

import org.junit.Test;

import static org.fest.assertions.Assertions.*;

public class EmployeeTest
{
    @Test
    public void employees_do_not_have_bonus()
    {
        Employee john = new Employee("John");

        double bonus = john.calculateBonus(1_000_000.00);

        assertThat(bonus).isZero();
    }

    @Test
    public void test_equality()
    {
        assertThat(new Employee("John")).isEqualTo(new Employee("John"));
        assertThat(new Employee("Mike")).isNotEqualTo(new Employee("John"));
        assertThat(new Employee("Joe")).isNotEqualTo(new Object());
    }

    @Test
    public void test_hashCode()
    {
        assertThat(new Employee("Joe").hashCode()).isNotEqualTo(new Employee("John").hashCode());
        assertThat(new Employee("Sara").hashCode()).isNotEqualTo(new Employee("Billy").hashCode());
        assertThat(new Employee("Bob").hashCode()).isEqualTo(new Employee("Bob").hashCode());
    }
}
