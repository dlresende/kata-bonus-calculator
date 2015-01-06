package net.diegolemos.bonuscalculator;

public enum Bonus {
	BASE(1.0), PLUS(2.27), PREMIUM(8.5);
	
	private final double bonus;
	
	private Bonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double calculate(double turnover) {
		return turnover * bonus / 100;
	}
	
	public double bonusValue() {
		return bonus;
	}
}
