package net.diegolemos.bonuscalculator;

public class Employee {
	protected final String name;
	protected final double bonus;

	public Employee(String name) {
		this(name, 0.0);
	}
	
	protected Employee(String name, double bonus) {
		this.name = name;
		this.bonus = bonus;
	}

	public double calculateBonus(double turnover) {
		return turnover * bonus / 100;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(bonus);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Employee other = (Employee) obj;
		if (Double.doubleToLongBits(bonus) != Double
				.doubleToLongBits(other.bonus)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", bonus=" + bonus + "]";
	}
}
