
public class InverseName {
	public static void main(String[] args){
		String s="Machael";
		System.out.println("Before reverse");
		System.out.println(s);
		
		System.out.println("After reverse");
		System.out.println(inverseName(s));
	}

	private static String inverseName(String s) {
		char[] arr=s.toCharArray();
		int start=0;
		int end=s.length()-1;
		char temp;
		while(start<end){
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		String result="";
		for(int i=0;i<arr.length;i++){
			result+=arr[i];
		}
		return result;
		
	}
}
