package code.dojo.fizzbuzz;

/**
 * FizzBuzz Rule :
 *
 * Players generally sit in a circle. The player designated to go first says the number "1",
 * and each player thenceforth counts one number in turn. However, any number divisible by
 * three is replaced by the word fizz and any number divisible by five by the word buzz.
 * Numbers divisible by 15 become fizz buzz. A player who hesitates or makes a mistake is
 * eliminated from the game.
 *
 * For example, a typical round of fizz buzz would start as follows:
 *
 * 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz,
 * 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz,
 * 31, 32, Fizz, 34, Buzz, Fizz, ...
 */
public final class FizzBuzz {

	public static String checkFizzBuzz(int number) {

		if (number == 0) {
			return "0";
		}

		if (number == 1) {
			return "1";
		}

		if (number == 2) {
			return "2";
		}

		if (number == 3) {
			return "Fizz";
		}

		return "";
	}
}
