package task6;

public class TaskSix {
	public static void execute(int a, int d) {
		int progressionInt = a;
		long progressionLong = a;
		int nForInt = 1;
		long nForLong = 1;
		while (progressionInt < Integer.MAX_VALUE / nForInt && progressionInt > Integer.MIN_VALUE / nForInt) {
			progressionInt = (a + (a + (d * nForInt))) / 2;
			nForInt++;
		}
		while (progressionLong < Long.MAX_VALUE / nForLong && progressionLong > Long.MIN_VALUE / nForLong) {
			progressionLong = (a + (a + (d * nForLong))) / 2;
			nForLong++;
		}

		System.out.println("Sixth task. N that exceed int limit is: " + nForInt + ", long limit: " + nForLong
				+ ". A1 = " + a + ", d = " + d);
	}

}
