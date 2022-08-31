package labworkWeek1;

public class Lab1Work {
	public static void main(String[] args) {
		double x = 4.345;
		double y = 4.256;
		double z = 4.333;
		System.out.println(max3(x, y, z));
		System.out.println(min3(x, y, z));
		System.out.println(mid3(x, y, z));
		System.out.println(xor(false, true));
		System.out.println(isFactor(126, 6));
		System.out.println(isPerfect(28));
		System.out.println(isPrime(14));

	}

	public static double max3(double x, double y, double z) {
		double maximum = 0;
		if (x > y && x > z) {
			maximum = x;
		} else if (y > x && y > z) {
			maximum = y;
		} else {
			maximum = z;
		}
		return maximum;
	}

	public static double min3(double x, double y, double z) {
		double minimum = 0;
		if (x < y && x < z) {
			minimum = x;
		} else if (y < x && y < z) {
			minimum = y;
		} else {
			minimum = z;
		}
		return minimum;
	}

	public static double mid3(double x, double y, double z) {
		double max = max3(x, y, z);
		double min = min3(x, y, z);
		double m = (x + y + z);
		double n = m - max - min;
		return n;
	}

	public static boolean xor(boolean a, boolean b) {
		System.out.println(a ^ b);
		return a ^ b;

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
				sum += i;
			}
		}
		if (sum == perfectNumber) {
			return true;
		}
		return false;
	}

	public static boolean isPrime(int primeNumber) {
		for (int i = 2; i < primeNumber; i++) {
			if (isFactor(primeNumber, i)) {
				return false;
			}
		}
		return true;
	}
}
