package by.epamtc.mathtask.task1;

public class TaskOne {

	public static void execute(double a, double b, double c) {
		double result;
		double firstPart = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a);
		double secondPart = a * a * a * c;
		double thirdPart = Math.pow(b, -2);
		result = firstPart - secondPart + thirdPart;
		System.out.printf("First task. Answer is %1.2f for a = %1.2f, b = %1.2f and c = %1.2f %n", result, a, b, c);
	}

}
