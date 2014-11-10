public class DetermineTwoAnagrams {
	public static void main(String[] args) {
		String s1 = "asdf";
		String s2 = "fdsa";
		String s3 = "asdfasdf";
		System.out.println(isTwoAnagrams(s1, s2));
		System.out.println(isTwoAnagrams(s3, s2));
	}

	public static boolean isTwoAnagrams(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		int[] letter = new int[256];
		char[] arr = s1.toCharArray();
		for (char ch : arr) {
			letter[ch]++;
		}
		int temp;
		for (int i = s2.length() - 1; i >= 0; i--) {
			temp = (int) s2.charAt(i);
			letter[temp]--;
			if (letter[temp] < 0) {
				return false;
			}
		}
		return true;

	}
}
