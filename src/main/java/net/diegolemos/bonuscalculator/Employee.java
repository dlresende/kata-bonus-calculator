package net.diegolemos.bonuscalculator;

public class Employee
{
    protected final String name;

    public Employee(String name)
    {
        this.name = name;
    }

    public double calculateBonus(double turnover)
    {
        return 0;
    }

    @Override
    public String toString() {
        return name;
    }
}
