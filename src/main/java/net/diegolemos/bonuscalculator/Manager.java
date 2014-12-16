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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numberOfSubalterns;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		if (numberOfSubalterns != other.numberOfSubalterns)
			return false;
		return true;
	}
}
