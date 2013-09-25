package net.diegolemos.bonuscalculator;

public class JuniorProgrammer extends Employee
{
    public JuniorProgrammer(String name)
    {
        super(name);
    }

    @Override
    public double calculateBonus(double turnover)
    {
        return turnover * 2.27 / 100;
    }
}
