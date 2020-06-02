package task4;

public class TaskFour {
	public static void execute(double x) {
		double y = 0;
		if(x>13) {
			y=-(3/(x++));
		}else {
			y=(-x*x*x)+9;
		}
		System.out.printf("Fourth task. Answer is %1.2f for x = %1.2f%n", y, x);
	}
}
