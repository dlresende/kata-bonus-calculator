package net.diegolemos.bonuscalculator;

public class Employee
{
    protected final String name;

    public Employee(String name)
    {
        assert name != null : "Employee name should not be null.";

        this.name = name;
    }

    public double calculateBonus(double turnover)
    {
        return 0;
    }

    @Override
    public boolean equals(Object object)
    {
        return !(object == null || !(object instanceof Employee)) && (object == this || name.equals(((Employee) object).name));
    }
}
