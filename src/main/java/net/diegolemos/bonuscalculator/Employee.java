package net.diegolemos.bonuscalculator;

public class Employee
{
    protected final String name;

    public Employee(String name)
    {
        assert name != null : "Employee name should not be null.";

        this.name = name;
    }

    public double calculateBonus(double turnover)
    {
        return 0;
    }

    public String getName() {
        return name;
    }
}
