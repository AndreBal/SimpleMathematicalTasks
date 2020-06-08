package task2;

public class TaskTwo {
	public static void execute(Integer day) {
		if (day < 1 || day > 365) {
			System.out.println("Second task. Wrong number. Your day should be bigger than 0 and less than 366");

		} else {
			int month = 1;
			boolean isMonthFound = false;
			while (!isMonthFound) {
				switch (month) {
				case (1):
				case (3):
				case (5):
				case (7):
				case (8):
				case (10):
				case (12):
					if (day > 31) {
						day -= 31;
						month++;
					} else {
						isMonthFound = true;
					}
					break;

				case (2):
					if (day > 28) {
						day -= 28;
						month++;
					} else {
						isMonthFound = true;
					}
					break;

				case (4):
				case (6):
				case (9):
				case (11):
					if (day > 30) {
						day -= 30;
						month++;
					} else {
						isMonthFound = true;
					}
					break;
				}
			}

			System.out.println("Second task. "+ day  +" day of month number " + month);
		}
	}

}
