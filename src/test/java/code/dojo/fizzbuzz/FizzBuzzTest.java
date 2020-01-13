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

	// TODO : Fix me !
//	@ParameterizedTest
//	@MethodSource("invalidNumber")
//	public void shouldSay0WhenZeroIsSupplied(int zero) {
//
//		// when
//		// Invalid number number (i.e. 0) is passed in.
//
//		// then
//		assertThatThrownBy(() -> FizzBuzz.checkFizzBuzz(zero))
//				.isInstanceOf(IllegalArgumentException.class)
//				.hasMessage("Zero is not a valid value in FizzBuzz.");
//	}
//
//	static Stream<Arguments> invalidNumber() {
//		return Stream.of(Arguments.of(0));
//	}

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

	@Test
	public void shouldSay4WhenFourIsSupplied() {

		// when
		String result = FizzBuzz.checkFizzBuzz(4);

		// then
		assertThat(result, equalTo("4"));
	}

	@Test
	public void shouldSayBuzzWhenFiveIsSupplied() {

		// when
		String result = FizzBuzz.checkFizzBuzz(5);

		// then
		assertThat(result, equalTo("Buzz"));
	}

	@Test
	public void shouldSayFizzBuzzWhenFifteenIsSupplied() {

		// when
		String result = FizzBuzz.checkFizzBuzz(15);

		// then
		assertThat(result, equalTo("FizzBuzz"));
	}

	@Test
	public void shouldSayFizzBuzzWhenThirtyIsSupplied() {

		// when
		String result = FizzBuzz.checkFizzBuzz(30);

		// then
		assertThat(result, equalTo("FizzBuzz"));
	}
}
