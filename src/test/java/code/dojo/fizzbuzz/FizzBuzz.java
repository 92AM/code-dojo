package code.dojo.fizzbuzz;

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
