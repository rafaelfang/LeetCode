package edu.missouri.cf797.leetcode;

public class SwapNodesInPairs {
	public ListNode swapPairs(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}
		ListNode p = new ListNode(-99);
		p.next = head;
		head = p;

		while (true) {
			if (p.next == null) {
				break;
			}
			if (p.next.next == null) {
				break;
			}
			ListNode q1 = p.next;
			ListNode q2 = q1.next;

			q1.next = q2.next;
			q2.next = q1;
			p.next = q2;

			p = q1;

		}
		return head.next;

	}
}
