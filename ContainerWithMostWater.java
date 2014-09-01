public class ContainerWithMostWater {
	public int maxArea(int[] height) {
		if(height==null){
			return 0;
		}
		int head=0;
		int tail=height.length-1;
		int area=Math.min(height[head], height[tail])*(tail-head);
		while(head<tail){
			if(height[head]<height[tail]){
				head++;
			}else{
				tail--;
			}
			area=Math.max(area, Math.min(height[head], height[tail])*(tail-head));
		}
		return area;
	}
}
