package by.epamtc.mathtask.task8;

import java.util.ArrayList;

public class TaskEight {
	public static void execute(double a, double b, double h) {
		ArrayList<Double> ar = new ArrayList<Double>();
		double number = a;
		double c = 5;
		while (number <= b) {
			if (number == 15) {
				ar.add((number + c) * 2);
			} else {
				ar.add((number - c) + 6);
			}
			number += h;
		}

		String result = ar.toString();
		System.out.printf("Eighth task. Answers are " + result + " for a = %1.2f, b = %1.2f and h = %1.2f %n", a, b, h);
	}
}
