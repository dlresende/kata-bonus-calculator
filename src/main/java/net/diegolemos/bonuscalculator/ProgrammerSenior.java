package net.diegolemos.bonuscalculator;

public class ProgrammerSenior extends Employee
{
    public ProgrammerSenior(String name)
    {
        super(name);
    }

    @Override
    public double calculateBonus(double turnover)
    {
        return turnover * 5.32 / 100;
    }
}
