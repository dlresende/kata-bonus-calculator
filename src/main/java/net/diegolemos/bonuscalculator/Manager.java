package net.diegolemos.bonuscalculator;

import static net.diegolemos.bonuscalculator.Bonus.PREMIUM;

public class Manager extends Employee
{
    private int numberOfSubalterns;

    public Manager(String name, int numberOfSubalterns)
    {
        super(name, PREMIUM);
        this.numberOfSubalterns = numberOfSubalterns;
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
