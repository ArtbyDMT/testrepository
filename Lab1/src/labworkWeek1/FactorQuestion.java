package labworkWeek1;

public class FactorQuestion {

	public static void main(String[] args) {
		// isFactor(12, 3);
		System.out.println(isPerfect(6));

	}

	public static boolean isFactor(int k, int n) {
		if (k % n == 0) {
			System.out.println(n + " is a factor");
			return true;
		}
		return false;
	}

	public static boolean isPerfect(int perfectNumber) {
		int sum = 0;

		for (int i = 1; i < perfectNumber; i++) {
			if (isFactor(perfectNumber, i)) {
				sum = sum + i;
			}
		}
		if (sum == perfectNumber) {
			return true;
		}
		return false;
	}
}
