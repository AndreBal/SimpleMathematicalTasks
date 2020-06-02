package task2;

public class TaskTwo {
	public static void execute(Integer day) {
		if (day < 1 || day > 365) {
			System.out.println("Second task. Wrong number. Your day should be bigger than 0 and less than 366");

		} else {
			int currentDay = day;
			String month = "";
			String[] months = { "january", "february", "march", "april", "may", "june", "july", "august", "september",
					"october", "november", "december" };
			int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			for (int i = 0; i < 12; i++) {
				if (daysInMonth[i] < currentDay) {
					currentDay -= daysInMonth[i];
				} else {
					month = months[i];
					break;
				}
			}

			System.out.println("Second task. Day " + day + " is " + currentDay + " of " + month);
		}
	}

}
