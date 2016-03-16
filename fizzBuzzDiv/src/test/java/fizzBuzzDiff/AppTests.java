package fizzBuzzDiff;

import static org.assertj.core.api.Assertions.assertThat;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AppTests {

	@Test
	public void fiveDividesBy5() {
		// given
		int five = 5;
		FizzBuzzDiv checkDivOfFive = new FizzBuzzDiv(five);

		// when
		boolean result = checkDivOfFive.isDivisible(five);

		// then
		assertThat(result).as("Five divides by 5.").isTrue();
	}

	@Test
	public void fiveDoesntDivBy3() {
		// given
		int five = 5;
		int three = 3;
		FizzBuzzDiv checkDivOfFive = new FizzBuzzDiv(five);

		// when
		boolean result = checkDivOfFive.isDivisible(three);

		// then
		assertThat(result).as("Five divides by 5.").isFalse();
	}
	
	@Test
	public void fifteenDividesBy3And5() {
		//g
		int five = 5;
		int three = 3;
		FizzBuzzDiv checkDivOfFifteen = new FizzBuzzDiv(15);
		SoftAssert softAssert = new SoftAssert();

		//W
		boolean isDivBy5 = checkDivOfFifteen.isDivisible(five);
		boolean isDivBy3 = checkDivOfFifteen.isDivisible(three);
		
		//t
		softAssert.assertEquals(isDivBy3, true);
		softAssert.assertEquals(isDivBy5, true);
		
		softAssert.assertAll();
		
	}
	
	@Test
	public void testIfForFiveGivesBuzz() {
		//g
		int five = 5;
		int three = 3;
		FizzBuzzDiv checkDivOfFive = new FizzBuzzDiv(five);
		String result;
		
		// W
		result = checkDivOfFive.printAccordingToDivisibility(three, five);
		String expected = "Buzz";
		
		//t
		assertThat(result).isEqualTo(expected);
	}
	
	@Test
	public void testIfForThreeGivesFizz() {
		//g
		int five = 5;
		int three = 3;
		FizzBuzzDiv checkDivOfThree = new FizzBuzzDiv(three);
		String result;
		
		// W
		result = checkDivOfThree.printAccordingToDivisibility(three, five);
		String expected = "Fizz";
		
		//t
		assertThat(result).isEqualTo(expected);
	}
	
	@Test
	public void testIfForFifteenGivesFizzBuzz() {
		//g
		int five = 5;
		int three = 3;
		FizzBuzzDiv checkDivOfThree = new FizzBuzzDiv(15);
		String result;
		
		// W
		result = checkDivOfThree.printAccordingToDivisibility(three, five);
		String expected = "FizzBuzz";
		
		//t
		assertThat(result).isEqualTo(expected);
	}
}
