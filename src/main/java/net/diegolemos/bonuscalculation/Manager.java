package net.diegolemos.bonuscalculation;

public class Manager extends Employee
{
    public Manager(String name)
    {
        super(name);
    }

    @Override
    public double calculateBonus(double turnover)
    {
        return turnover * 8.5 / 100;
    }
}
