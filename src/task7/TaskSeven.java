package task7;

public class TaskSeven {
	public static void execute(double r) {
		int a = (int)r;
		double result = (r%1*1000)+a*1.0/1000;
		System.out.printf("Seventh task. Answer is %1.3f for r = %1.3f%n", result, r);
	}

}
