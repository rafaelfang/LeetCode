
public class DetermineIsUniqueChars {
	public static void main(String[] args){
		String s1="asds";
		System.out.println(containsUniqueChars(s1));
		String s2="asd";
		System.out.println(containsUniqueChars(s2));
	}
	
	private static boolean containsUniqueChars(String s){
		if(s.length()>256){
			return false;
		}
		boolean[] arr=new boolean[256];
		
		for(int i=0;i<s.length();i++){
			int code=s.charAt(i);
			if(arr[code]==true){
				return false;
			}
			arr[code]=true;
		}
		return true;
	}
}
