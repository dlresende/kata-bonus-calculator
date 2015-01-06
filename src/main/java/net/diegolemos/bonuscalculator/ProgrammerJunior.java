package net.diegolemos.bonuscalculator;

import static net.diegolemos.bonuscalculator.Bonus.PLUS;

public class ProgrammerJunior extends Employee
{
    private final boolean hasReadCleanCode;

    public ProgrammerJunior(String name, boolean hasReadCleanCode)
    {
        super(name, PLUS);
        this.hasReadCleanCode = hasReadCleanCode;
    }

    @Override
    public String toString() {
        return super.toString() + (hasReadCleanCode ? " (has read Clean Code©)" : "");
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (hasReadCleanCode ? 1231 : 1237);
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
		ProgrammerJunior other = (ProgrammerJunior) obj;
		if (hasReadCleanCode != other.hasReadCleanCode)
			return false;
		return true;
	}
}
