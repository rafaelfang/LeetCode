public class HasCycle {
	public boolean hasCycle(ListNode head) {
		if (head == null) {
			return false;
		}
		ListNode fast, slow;
		fast = head;
		slow = head;

		while (true) {
			slow = slow.next;

			if (fast.next != null) {
				fast = fast.next.next;
			}else{
				return false;
			}

			if (slow == null || fast == null) {
				return false;
			}
			if (slow == fast) {
				return true;
			}

		}

	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}
