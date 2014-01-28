package net.diegolemos.bonuscalculator;

public class ProgrammerJunior extends Employee
{
    public ProgrammerJunior(String name)
    {
        super(name);
    }

    @Override
    public double calculateBonus(double turnover)
    {
        return turnover * 2.27 / 100;
    }
}
