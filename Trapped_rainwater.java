import java.util.*;
public class Main
{
    public static int TrappedRainwater(int height[]){
        /*calc left max boundary - array
        calc right max boundary - array
        loop 
        waterlevel=min(max leftboundary-max right boundary)
        trapped water=waterlevel-height*/
        
        int n = height.length;
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        int RightMax[]=new int[height.length];
        RightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            RightMax[i]=Math.max(height[i],RightMax[i+1]);
        }
       int trappedwater=0;
       for(int i=0;i<n;i++){
           int waterlevel=Math.min(leftMax[i],RightMax[i]);
           trappedwater+=waterlevel-height[i];
       }
       return trappedwater;
    }
	public static void main(String[] args) {
		int height[]={4,5,1,0,6,3,2,5};
		System.out.println(TrappedRainwater(height));
	}
}
