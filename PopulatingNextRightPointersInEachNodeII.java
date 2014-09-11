public class PopulatingNextRightPointersInEachNodeII {
	public void connect(TreeLinkNode root) {
		if(root!=null){
			root.next=null;
		}
		while(root!=null){
			TreeLinkNode newRoot=null;
			TreeLinkNode newTail=null;
			while(root!=null){
				if(root.left!=null){
					if(newRoot==null){
						newRoot=root.left;
						newTail=root.left;
					}else{
						newTail.next=root.left;
						newTail=newTail.next;
						newTail.next=null;
					}
				}
				if(root.right!=null){
					if(newRoot==null){
						newRoot=root.right;
						newTail=root.right;
					}else{
						newTail.next=root.right;
						newTail=newTail.next;
						newTail.next=null;
					}
				}
				root=root.next;
			}
			root=newRoot;
		}
	}
}
