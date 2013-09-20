package net.diegolemos.bonuscalculation;

import java.util.Arrays;

public class Programmer extends Employee
{
    private final Level level;

    public Programmer(String name, Level level)
    {
        super(name);

        assert level != null : "Programmer level should not be null.";

        this.level = level;
    }

    @Override
    public double calculateBonus(double turnover)
    {
        switch (level) {
            case JUNIOR:
                return turnover * 2.27 / 100;
            case SENIOR:
                return turnover * 5.32 / 100;
            default:
                throw new IllegalStateException("Programmer level should be " + Arrays.toString(Level.values()));
        }
    }

    @Override
    public boolean equals(Object object)
    {
        return !(object == null || !(object instanceof Programmer)) && (object == this || super.equals(object) && ((Programmer) object).level == this.level);
    }

    public enum Level {JUNIOR, SENIOR}
}
