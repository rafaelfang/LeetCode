
public class RemoveNthNodeFromEndOfList {
	public static ListNode removeNthFromEnd(ListNode head, int n){
		ListNode first=head;
		ListNode second=head;
		for(int i=0;i<n;i++){
			first=first.next;
			
		}
		
		if(first==null){
			head=head.next;
			return head;
		}
		
		while(first.next!=null){
			first=first.next;
			second=second.next;
		}
		second.next=second.next.next;
		return head;
	}
	
	public static void main(String[] args){
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		head.next.next.next.next=new ListNode(5);
		printList(head);
		printList(removeNthFromEnd(head,5));
		printList(removeNthFromEnd(head,2));
	}

	private static void printList(ListNode head) {
		while(head!=null){
			System.out.print(head.val+"->");
			head=head.next;
		}
		System.out.print("Finish");
		System.out.println();
		
	}
}
