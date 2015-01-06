package net.diegolemos.bonuscalculator;

import static net.diegolemos.bonuscalculator.Bonus.BASE;
import static net.diegolemos.bonuscalculator.Bonus.PLUS;
import static net.diegolemos.bonuscalculator.Bonus.PREMIUM;
import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class BonusTest {
	
	private static final double TURNOVER = 1_000_000.00;

	@Test
	public void base_bonus_should_be_1() {
        assertThat(BASE.calculate(TURNOVER)).isEqualTo(TURNOVER * 1.0 / 100);
	}

	@Test
	public void plus_bonus_should_be_2_27() {
		assertThat(PLUS.calculate(TURNOVER)).isEqualTo(TURNOVER * 2.27 / 100);
	}
	
	@Test
	public void premium_bonus_should_be_8_5() {
		assertThat(PREMIUM.calculate(TURNOVER)).isEqualTo(TURNOVER * 8.5 / 100);
	}
}
