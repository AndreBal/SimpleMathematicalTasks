package task3;

public class TaskThree {
	public static void execute(double a, double b, double c) {
		if (a > b && b > c) {
			a *= 2;
			b *= 2;
			c *= 2;
		} else {
			if(a<0) {
				a=-a;
			}
			if(b<0) {
				b=-b;
			}
			if(c<0) {
				c=-c;
			}
		}
		System.out.printf("Third task. Now a = %1.2f, b = %1.2f and c = %1.2f %n", a, b, c);
	}

}
