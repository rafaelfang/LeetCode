public class ClimbingStairs {
	public static int climbStairs(int n) {
		/*
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;
		} else {
			return climbStairs(n - 1) + climbStairs(n - 2);
		}
		*/
		if(n==1){
			return 1;
		}else if(n==2){
			return 2;
		}else{
			int[] result=new int[n+1];
			result[1]=1;
			result[2]=2;
			for(int i=3;i<=n;i++){
				result[i]=result[i-1]+result[i-2];
			}
			return result[n];
		}
	}

	public static void main(String[] args) {
		System.out.println(climbStairs(5));
	}
}
