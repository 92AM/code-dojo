package code.dojo.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class FizzBuzzTest {

	@Test
	public void shouldSayFizz() {
		//then
		assertThat("Fizz", equalTo("Fizz"));
	}

	@Test
	public void shouldSay0FizzWhenZeroIsSupplied() {

		// when
		String result = FizzBuzz.checkFizzBuzz(0);

		// then
		assertThat(result, equalTo("0"));
	}

	@Test
	public void shouldSay1WhenOneIsSupplied() {

		// when
		String result = FizzBuzz.checkFizzBuzz(1);

		// then
		assertThat(result, equalTo("1"));
	}

	@Test
	public void shouldSay2WhenTwoIsSupplied() {

		// when
		String result = FizzBuzz.checkFizzBuzz(2);

		// then
		assertThat(result, equalTo("2"));
	}

	@Test
	public void shouldSayFizzWhenThreeIsSupplied() {

		// when
		String result = FizzBuzz.checkFizzBuzz(3);

		// then
		assertThat(result, equalTo("Fizz"));
	}
}
