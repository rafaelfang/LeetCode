public class PalindromeNumber {
	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int div = 1;
		while (x / div >= 10) {
			div = div * 10;
		}
		int left;
		int right;
		while (x != 0) {
			left = x / div;
			right = x % 10;
			if (left != right) {
				return false;
			}
			x = (x % div) / 10;
			div = div / 100;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(2552));
		System.out.println(isPalindrome(25152));
		System.out.println(isPalindrome(253));

	}
}
