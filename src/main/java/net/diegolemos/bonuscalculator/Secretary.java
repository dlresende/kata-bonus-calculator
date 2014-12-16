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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + wordsPerMinute;
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
		Secretary other = (Secretary) obj;
		if (wordsPerMinute != other.wordsPerMinute)
			return false;
		return true;
	}
}
