import java.util.ArrayList;
import java.util.List;

public class GrayCode {
	public List<Integer> grayCode(int n) {
		if (n < 0) {
			return null;
		}
		List<Integer> myList = new ArrayList<Integer>();
		int size = 1 << n;
		for (int i = 0; i < size; i++) {
			myList.add(binaryToGray(i));
		}
		return myList;
	}

	public int binaryToGray(int num) {
		return (num >> 1) ^ num;
	}
}
