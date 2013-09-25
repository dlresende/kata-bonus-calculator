package net.diegolemos.bonuscalculator;

public class SeniorProgrammer extends Employee
{
    public SeniorProgrammer(String name)
    {
        super(name);
    }

    @Override
    public double calculateBonus(double turnover)
    {
        return turnover * 5.32 / 100;
    }
}
