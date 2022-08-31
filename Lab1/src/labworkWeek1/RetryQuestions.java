package labworkWeek1;

public class RetryQuestions {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		System.out.println(max3(a, b, c));
		System.out.println(min3(a, b, c));
		System.out.println(mid3(a, b, c));
		System.out.println(xor(true, false));
		System.out.println(isFactor(10, 4));
		System.out.println(isPerfect(6));

	}

	public static int max3(int a, int b, int c) {
		int maximum = 0;
		if (a > b && b > c) {
			maximum = a;
		} else if (b > a && b > c) {
			maximum = b;
		} else {
			maximum = c;
		}
		return maximum;
	}

	public static int min3(int a, int b, int c) {
		int minimum = 0;
		if (a < b && b < c) {
			minimum = a;
		} else if (b < a && b < c) {
			minimum = b;
		} else {
			minimum = c;
		}
		return minimum;

	}

	static int mid3(int a, int b, int c) {
		int d = a + b + c;
		int max = max3(a, b, c);
		int min = min3(a, b, c);
		int mid = d - max - min;
		return mid;

	}

	static boolean xor(boolean x, boolean y) {
		return x ^ y;
	}

	static boolean isFactor(int k, int n) {
		if (k % n == 0) {
			return true;
		}
		return false;
	}

	static boolean isPerfect(int perfectNum) {
		int sum = 0;
		for(int i=1; i< perfectNum; i++); {
	if (isFactor(perfectNum, i))
		sum +=1;
		}
}}
