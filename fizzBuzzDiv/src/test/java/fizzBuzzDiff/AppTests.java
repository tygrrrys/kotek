package fizzBuzzDiff;

import static org.assertj.core.api.Assertions.assertThat;
import org.testng.annotations.Test;

public class AppTests {

	@Test
	public void fiveDividesBy5() {
		// given
		int five = 5;
		FizzBuzzDiv checkDiv = new FizzBuzzDiv(five);

		// when
		boolean result = checkDiv.isDivisible(five);

		// then
		assertThat(result).as("Five divides by 5.").isTrue();
	}

	@Test
	public void fiveDoesntDivBy3() {
		// given
		int five = 5;
		int three = 3;
		FizzBuzzDiv checkDiv = new FizzBuzzDiv(five);

		// when
		boolean result = checkDiv.isDivisible(three);

		// then
		assertThat(result).as("Five divides by 5.").isFalse();
	}

}
