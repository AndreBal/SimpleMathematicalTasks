package by.epamtc.mathtask.task9;

public class TaskNine {
	public static void execute() {
		long result = 1;
		for(int i = 2;i<=10;i++) {
			int number = 0;
			for(int j = 1;j<=i;j++) {
				number+=j;
			}
			result*=number;
		}
		
		System.out.println("Ninth task. Answer is " + result);
	}

}
