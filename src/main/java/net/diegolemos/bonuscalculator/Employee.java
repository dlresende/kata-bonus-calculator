package net.diegolemos.bonuscalculator;

import static net.diegolemos.bonuscalculator.Bonus.BASE;

public class Employee {
	protected final String name;
	protected final Bonus bonus;
	
	public Employee(String name) {
		this(name, BASE);
	}
	
	protected Employee(String name, Bonus bonus) {
		this.name = name;
		this.bonus = bonus;
	}

	public double calculateBonus(double turnover) {
		return bonus.calculate(turnover);
	}
	
	public Bonus bonus() {
		return bonus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bonus == null) ? 0 : bonus.hashCode());
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
		if (bonus != other.bonus) {
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
