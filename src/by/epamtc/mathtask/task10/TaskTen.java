package by.epamtc.mathtask.task10;

import java.util.Scanner;

public class TaskTen {

	public static void execute() {
		Scanner sc = new Scanner(System.in);
		int number;
		int previousNumber = 0;
		boolean isIncreasing = true;
		boolean hasEqualNeighbours = false;
		boolean isAlternating = true;
		System.out.println("Please type number. (Type 0, to exit)");
		while ((number = Integer.parseInt(sc.next())) != 0) {
			if (previousNumber != 0) {
				if(previousNumber >= number) {
					isIncreasing = false;
				}
				if(previousNumber == number) {
					hasEqualNeighbours = true;
				}
				if(!((previousNumber>0 && number<0) || (previousNumber<0 && number>0))) {
					isAlternating = false;
				}
			}
			previousNumber = number;
			System.out.println("Please type number. (Type 0, to exit)");
		}
		sc.close();
		System.out.println("Tenth task. Secuence is Incresing: " + isIncreasing + ", has equal neighbours " + hasEqualNeighbours + ", is alternates between negative and positive " +isAlternating);
	}

}
