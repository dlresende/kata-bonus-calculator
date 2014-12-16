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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (knowsCobol ? 1231 : 1237);
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
		ProgrammerSenior other = (ProgrammerSenior) obj;
		if (knowsCobol != other.knowsCobol)
			return false;
		return true;
	}
}
