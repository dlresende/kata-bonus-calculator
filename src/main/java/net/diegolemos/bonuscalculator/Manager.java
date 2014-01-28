package net.diegolemos.bonuscalculator;

public class Manager extends Employee
{
    private int numberOfSubalterns;

    public Manager(String name, int numberOfSubalterns)
    {
        super(name);
        this.numberOfSubalterns = numberOfSubalterns;
    }

    @Override
    public double calculateBonus(double turnover)
    {
        return turnover * 8.5 / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + numberOfSubalterns + " subaltern(s))";
    }
}
