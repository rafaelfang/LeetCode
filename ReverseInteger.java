import java.util.Stack;

public class ReverseInteger {
	public static int reverse(int x) {
		if (x == 0) {
			return 0;
		}
		while (x % 10 == 0) {
			x = x / 10;
		}

		if (x > 0) {
			return reversePositive(x);
		} else {
			return -reversePositive(-x);
		}

	}

	public static int reversePositive(int x) {
		int result = 0;

		while (x / 10 != 0) {
			result = (result + (x % 10)) * 10;
			x = x / 10;
		}
		result = result + x;
		return result;
	}

	public static void main(String[] args) {
		int x = 123;
		System.out.println(reverse(x));
		int y = -123;
		System.out.println(reverse(y));
		int z = 0;
		System.out.println(reverse(z));
		int k = 100;
		System.out.println(reverse(k));
		int t = -100;
		System.out.println(reverse(t));
	}
}
