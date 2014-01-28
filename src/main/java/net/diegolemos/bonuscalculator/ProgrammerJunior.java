package net.diegolemos.bonuscalculator;

public class ProgrammerJunior extends Employee
{
    private final boolean hasReadCleanCode;

    public ProgrammerJunior(String name, boolean hasReadCleanCode)
    {
        super(name);
        this.hasReadCleanCode = hasReadCleanCode;
    }

    @Override
    public double calculateBonus(double turnover)
    {
        return turnover * 2.27 / 100;
    }

    @Override
    public String toString() {
        return super.toString() + (hasReadCleanCode ? " (has read Clean Code©)" : "");
    }
}
