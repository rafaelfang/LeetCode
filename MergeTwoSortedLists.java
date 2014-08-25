public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) {
			return null;
		} else if (l1 == null && l2 != null) {
			return l2;
		} else if (l2 == null && l1 != null) {
			return l1;
		} else {
			ListNode head=new ListNode(-99);
			ListNode l=head;
			while(l1!=null && l2!=null){
				if(l1.val<l2.val){
					l.next=l1;
					l1=l1.next;
				}else{
					l.next=l2;
					l2=l2.next;
				}
				l=l.next;
			}
			if(l1!=null){
				l.next=l1;
			}else{
				l.next=l2;
			}
			l=head.next;
			return l;
		}
	}
}
