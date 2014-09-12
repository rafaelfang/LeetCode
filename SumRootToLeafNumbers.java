public class SumRootToLeafNumbers {
	public int sumNumbers(TreeNode root) {
		int val=0;
		return(sumNum(root,val));
	}

	private static int sumNum(TreeNode root, int val) {
		if(root==null){
			return 0;
		}
		val=10*val+root.val;
		if(root.left==null&&root.right==null){
			return val;
		}
		
		return sumNum(root.left,val)+sumNum(root.right,val);
		
	}
	
	public static void main(String[] args){
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		int val=0;
		System.out.println(sumNum(root,val));
	}

	

	
}
