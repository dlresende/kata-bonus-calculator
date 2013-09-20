package net.diegolemos.bonuscalculator;

public class Secretary extends Employee
{
    public Secretary(String name)
    {
        super(name);
    }

    @Override
    public double calculateBonus(double turnover)
    {
        return turnover / 100;
    }
}
