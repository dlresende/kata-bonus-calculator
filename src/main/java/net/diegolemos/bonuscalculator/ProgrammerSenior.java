package net.diegolemos.bonuscalculator;

public class ProgrammerSenior extends Employee
{
    private final boolean knowsCobol;

    public ProgrammerSenior(String name, boolean knowsCobol)
    {
        super(name);
        this.knowsCobol = knowsCobol;
    }

    @Override
    public double calculateBonus(double turnover)
    {
        return turnover * 5.32 / 100;
    }

    @Override
    public String toString() {
        return super.toString() + (knowsCobol ? " (knows COBOL)" : "");
    }
}
