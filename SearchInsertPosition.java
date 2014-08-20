public class SearchInsertPosition {
	public static int searchInsert(int[] A, int target) {
		if(A.length==0){
			return 0;
		}
		
		if(target<A[0]){
			return 0;
		}
		
		for(int i=0;i<A.length;i++){
			if(target<=A[i]){
				return i;
			}
		}
		
		return A.length;
	}
	
	public static void main(String[] args){
		int[] arr={1,3,5,6};
		System.out.println(searchInsert(arr,5));
		System.out.println(searchInsert(arr,2));
		System.out.println(searchInsert(arr,7));
		System.out.println(searchInsert(arr,0));
	}
}
