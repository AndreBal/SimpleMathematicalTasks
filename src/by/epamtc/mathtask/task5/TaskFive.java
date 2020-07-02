package by.epamtc.mathtask.task5;

public class TaskFive {
	public static void execute(int number) {
		if (number < 100 || number > 999) {
			System.out.println("Fifth task. Wrong number. Your number should be bigger than 99 and less than 1000");
		} else {
			int sumOfDigits = getSumOfDigits(number);
			int productOfDigits = getproductOfDigits(number);
			int digitsMashup = swapTensAndHundreds(number);
			int fourDigitNumber = getFourDigitNumber(number);
			System.out.println("Fifth task. For number " + number + ": Sum Of Digits is " + sumOfDigits
					+ ", product Of Digits is " + productOfDigits + ", result of swapping tens and hundreds is "
					+ digitsMashup + ", fout digit number is " + fourDigitNumber);
		}
	}

	private static int getSumOfDigits(int number) {
		int sumOfDigits = 0;
		for (int i = 0; i < 3; i++) {
			sumOfDigits += number % 10;
			number /= 10;
		}
		return sumOfDigits;
	}

	private static int getproductOfDigits(int number) {
		int productOfDigits = 1;
		for (int i = 0; i < 3; i++) {
			productOfDigits *= number % 10;
			number /= 10;
		}
		return productOfDigits;
	}

	private static int swapTensAndHundreds(int number) {
		int tens = number / 10 % 10;
		int hundreds = number / 100;
		int digitsMashup = tens * 100 + hundreds * 10 + number % 10;
		return digitsMashup;
	}

	private static int getFourDigitNumber(int number) {
		int fourDigitNumber = number + number % 10 * 1000;
		return fourDigitNumber;
	}
}
