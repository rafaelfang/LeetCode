public class SearchInRotatedSortedArrayII {
	public static void main(String[] args){
		int[] A={1,2,3,0};
		System.out.println(search(A,0));
	}
	
	public static boolean search(int[] A, int target) {
		int left=0;
		int right=A.length-1;
		while(left<=right){
			int middle = (left+right)/2;
			if(A[middle]==target){
				return true;
			}else{
				int label=1;
				if(A[middle]<A[right]){
					label=1;
				}else if(A[middle]==A[right]){
					for(int i=middle+1;i<=right;i++){
						if(A[middle]!=A[i]){
							label=0;
							break;
						}
					}
				}else{
					label=0;
				}
				if(label==1){
					if(target>A[middle]&&target<=A[right]){
						left=middle+1;
					}else{
						right=middle-1;
					}
				}else{
					if(target>A[right]&&target<A[middle]){
						right=middle-1;
					}else{
						left=middle+1;
					}
				}
			}
		}
		return false;
	}
}
