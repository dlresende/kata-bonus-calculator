package net.diegolemos.bonuscalculator;

public class Secretary extends Employee
{
    private final int wordsPerMinute;

    public Secretary(String name, int wordsPerMinute)
    {
        super(name);
        this.wordsPerMinute = wordsPerMinute;
    }

    @Override
    public double calculateBonus(double turnover)
    {
        return turnover / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " (types " + wordsPerMinute + " words/minute(s))";
    }
}
