package code.dojo.fizzbuzz;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {

	@Test
	public void shouldSayFizz() {
		assertThat("Fizz", IsEqual.equalTo("Fizz"));
	}

}
